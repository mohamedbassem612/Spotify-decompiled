package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.h;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bf40 implements qzr0 {
    public static final uz00 b = uz00.a();
    public final h a;

    public bf40(h hVar) {
        this.a = hVar;
    }

    public static void a(h hVar) throws InvalidProtocolBufferException {
        if (hVar != null && !hVar.isInitialized()) {
            throw new InvalidProtocolBufferException(hVar.newUninitializedMessageException().getMessage());
        }
    }

    public final h b(InputStream inputStream, uz00 uz00Var) throws InvalidProtocolBufferException {
        lwg lwgVarG = lwg.g(inputStream);
        h partialFrom = h.parsePartialFrom(this.a, lwgVarG, uz00Var);
        lwgVarG.a(0);
        a(partialFrom);
        return partialFrom;
    }

    public final h c(byte[] bArr) throws InvalidProtocolBufferException {
        h hVarM = h.m(this.a, bArr, bArr.length, b);
        a(hVarM);
        return hVarM;
    }
}
