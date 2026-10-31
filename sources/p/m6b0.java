package p;

import java.io.ByteArrayInputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m6b0 extends u2o1 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException */
    public m6b0(Metadata metadata) throws InvalidProtocolBufferException {
        String[] strArrD1 = metadata.d1();
        strArrD1 = strArrD1.length == 0 ? null : strArrD1;
        if (strArrD1 != null) {
            String[] strArrD2 = metadata.d2();
            vz00 vz00Var = fka0.a;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(pwa.a(strArrD1));
            vz00 vz00Var2 = fka0.a;
            jja0 jja0Var = new jja0((dka0) dka0.h.a(byteArrayInputStream, vz00Var2), strArrD2);
            tja0 tja0Var = yfy0.Z0;
            tja0Var.getClass();
            mwg mwgVar = new mwg(byteArrayInputStream);
            t8 t8Var = (t8) tja0Var.b(mwgVar, vz00Var2);
            try {
                mwgVar.a(0);
                if (!t8Var.isInitialized()) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                    invalidProtocolBufferException.a = t8Var;
                    throw invalidProtocolBufferException;
                }
                yfy0 yfy0Var = (yfy0) t8Var;
                eso1.H(yfy0Var, new uu0(jja0Var, new l141(yfy0Var.Q0), y3j1.b, new hja0(metadata.mv()).compareTo(new hja0(1, 4, 0)) < 0, (List) null, 48));
            } catch (InvalidProtocolBufferException e) {
                e.a = t8Var;
                throw e;
            }
        }
        new hja0(metadata.mv());
        metadata.xi();
    }
}
