package p;

import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class s8 implements s2j0 {
    protected int memoizedHashCode;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        r8.addAll((Iterable) iterable, (List) list);
    }

    public static void checkByteStringIsUtf8(phc phcVar) {
        if (phcVar.o()) {
            return;
        }
        hhg1.n("Byte string is not UTF-8.");
    }

    public final String c(String str) {
        return cy30.p("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public abstract int getSerializedSize(sm41 sm41Var);

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    @Override // p.s2j0
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = rwg.b;
            nwg nwgVar = new nwg(bArr, serializedSize);
            writeTo(nwgVar);
            if (nwgVar.E() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            bhn0.o(c("byte array"), e);
            return null;
        }
    }

    @Override // p.s2j0
    public phc toByteString() {
        try {
            int serializedSize = getSerializedSize();
            hhc hhcVar = phc.b;
            it8 it8Var = new it8(serializedSize);
            writeTo(it8Var.j());
            return it8Var.g();
        } catch (IOException e) {
            bhn0.o(c("ByteString"), e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iF = rwg.f(serializedSize) + serializedSize;
        if (iF > 4096) {
            iF = 4096;
        }
        pwg pwgVar = new pwg(outputStream, iF);
        pwgVar.B(serializedSize);
        writeTo(pwgVar);
        if (pwgVar.f > 0) {
            pwgVar.J();
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = rwg.b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        pwg pwgVar = new pwg(outputStream, serializedSize);
        writeTo(pwgVar);
        if (pwgVar.f > 0) {
            pwgVar.J();
        }
    }
}
