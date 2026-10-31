package p;

import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i6b0 extends u2o1 {
    public final l3b0 c;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException */
    public i6b0(Metadata metadata) throws InvalidProtocolBufferException {
        String[] strArrP = lnn1.p(metadata);
        String[] strArrD2 = metadata.d2();
        vz00 vz00Var = fka0.a;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(pwa.a(strArrP));
        vz00 vz00Var2 = fka0.a;
        jja0 jja0Var = new jja0((dka0) dka0.h.a(byteArrayInputStream, vz00Var2), strArrD2);
        tja0 tja0Var = hfy0.h1;
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
            l3b0 l3b0VarF = eso1.F((hfy0) t8Var, jja0Var, new hja0(metadata.mv()).compareTo(new hja0(1, 4, 0)) < 0, 4);
            new hja0(metadata.mv());
            metadata.xi();
            this.c = l3b0VarF;
        } catch (InvalidProtocolBufferException e) {
            e.a = t8Var;
            throw e;
        }
    }

    public final l3b0 y() {
        return this.c;
    }
}
