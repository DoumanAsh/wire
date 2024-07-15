// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.ExtensionRangeOptions in google/protobuf/descriptor.proto

public struct ExtensionRangeOptions {

    public var unknownFields: ExtensibleUnknownFields = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

extension ExtensionRangeOptions : ProtoExtensible {
}

#if !WIRE_REMOVE_EQUATABLE
extension ExtensionRangeOptions : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension ExtensionRangeOptions : Hashable {
}
#endif

extension ExtensionRangeOptions : Sendable {
}

extension ExtensionRangeOptions : ProtoDefaultedValue {

    public static var defaultedValue: Self {
        .init()
    }
}

extension ExtensionRangeOptions : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/google.protobuf.ExtensionRangeOptions"
    }

}

extension ExtensionRangeOptions : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension ExtensionRangeOptions : Codable {

    public enum CodingKeys : CodingKey {
    }

}
#endif