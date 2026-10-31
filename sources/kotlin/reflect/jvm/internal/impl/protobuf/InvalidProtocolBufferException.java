package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import p.t8;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class InvalidProtocolBufferException extends IOException {
    public t8 a;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.a = null;
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
