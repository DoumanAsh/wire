// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.person.Person in person.proto
import Foundation
import Wire

/**
 * Message representing a person, includes their name, unique ID number, email and phone number.
 */
public struct Person {

    /**
     * The customer's full name.
     */
    public var name: String
    /**
     * The customer's ID number.
     */
    public var id: Int32
    /**
     * Email address for the customer.
     */
    public var email: String?
    /**
     * A list of the customer's phone numbers.
     */
    public var phone: [PhoneNumber]
    public var aliases: [String]
    public var unknownFields: Data = .init()

    public init(
        name: String,
        id: Int32,
        email: String? = nil,
        phone: [PhoneNumber] = [],
        aliases: [String] = []
    ) {
        self.name = name
        self.id = id
        self.email = email
        self.phone = phone
        self.aliases = aliases
    }

    /**
     * Represents the type of the phone number: mobile, home or work.
     */
    public enum PhoneType : UInt32, CaseIterable, ProtoEnum {

        case MOBILE = 0
        case HOME = 1
        /**
         * Could be phone or fax.
         */
        case WORK = 2

        public var description: String {
            switch self {
            case .MOBILE: return "MOBILE"
            case .HOME: return "HOME"
            case .WORK: return "WORK"
            }
        }

    }

    public struct PhoneNumber {

        /**
         * The customer's phone number.
         */
        public var number: String
        /**
         * The type of phone stored here.
         */
        public var type: PhoneType?
        public var unknownFields: Data = .init()

        public init(number: String, type: PhoneType? = nil) {
            self.number = number
            self.type = type
        }

    }

}

#if swift(>=5.5)
extension Person.PhoneType : Sendable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Person.PhoneNumber : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Person.PhoneNumber : Hashable {
}
#endif

#if swift(>=5.5)
extension Person.PhoneNumber : Sendable {
}
#endif

extension Person.PhoneNumber : ProtoMessage {
    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.kotlin.person.Person.PhoneNumber"
    }
}

extension Person.PhoneNumber : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        var number: String? = nil
        var type: Person.PhoneType? = nil

        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            case 1: number = try reader.decode(String.self)
            case 2: type = try reader.decode(Person.PhoneType.self)
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

        self.number = try Person.PhoneNumber.checkIfMissing(number, "number")
        self.type = type
    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.encode(tag: 1, value: self.number)
        try writer.encode(tag: 2, value: self.type)
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Person.PhoneNumber : Codable {
    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self.number = try container.decode(String.self, forKey: "number")
        self.type = try container.decodeIfPresent(Person.PhoneType.self, forKey: "type")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)
        let includeDefaults = encoder.protoDefaultValuesEncodingStrategy == .include

        if includeDefaults || !self.number.isEmpty {
            try container.encode(self.number, forKey: "number")
        }
        try container.encodeIfPresent(self.type, forKey: "type")
    }
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Person : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Person : Hashable {
}
#endif

#if swift(>=5.5)
extension Person : Sendable {
}
#endif

extension Person : ProtoMessage {
    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.kotlin.person.Person"
    }
}

extension Person : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        var name: String? = nil
        var id: Int32? = nil
        var email: String? = nil
        var phone: [Person.PhoneNumber] = []
        var aliases: [String] = []

        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            case 1: name = try reader.decode(String.self)
            case 2: id = try reader.decode(Int32.self)
            case 3: email = try reader.decode(String.self)
            case 4: try reader.decode(into: &phone)
            case 5: try reader.decode(into: &aliases)
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

        self.name = try Person.checkIfMissing(name, "name")
        self.id = try Person.checkIfMissing(id, "id")
        self.email = email
        self.phone = phone
        self.aliases = aliases
    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.encode(tag: 1, value: self.name)
        try writer.encode(tag: 2, value: self.id)
        try writer.encode(tag: 3, value: self.email)
        try writer.encode(tag: 4, value: self.phone)
        try writer.encode(tag: 5, value: self.aliases)
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension Person : Codable {
    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self.name = try container.decode(String.self, forKey: "name")
        self.id = try container.decode(Int32.self, forKey: "id")
        self.email = try container.decodeIfPresent(String.self, forKey: "email")
        self.phone = try container.decodeProtoArray(Person.PhoneNumber.self, forKey: "phone")
        self.aliases = try container.decodeProtoArray(String.self, forKey: "aliases")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)
        let includeDefaults = encoder.protoDefaultValuesEncodingStrategy == .include

        if includeDefaults || !self.name.isEmpty {
            try container.encode(self.name, forKey: "name")
        }
        if includeDefaults || self.id != 0 {
            try container.encode(self.id, forKey: "id")
        }
        try container.encodeIfPresent(self.email, forKey: "email")
        if includeDefaults || !self.phone.isEmpty {
            try container.encodeProtoArray(self.phone, forKey: "phone")
        }
        if includeDefaults || !self.aliases.isEmpty {
            try container.encodeProtoArray(self.aliases, forKey: "aliases")
        }
    }
}
#endif