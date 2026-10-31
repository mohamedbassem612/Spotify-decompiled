package p;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i4b0 implements s82 {
    public static final byte[] c = new byte[0];
    public final tpa0 a;
    public final gl4 b;

    public i4b0(tpa0 tpa0Var, gl4 gl4Var) {
        this.a = tpa0Var;
        this.b = gl4Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        u8 u8Var;
        tpa0 tpa0Var = this.a;
        Logger logger = vf11.a;
        synchronized (vf11.class) {
            try {
                o5 o5Var = vf11.b(tpa0Var.o()).a;
                Class clsP = o5Var.p();
                if (!((Map) o5Var.c).keySet().contains(clsP) && !Void.class.equals(clsP)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + o5Var.toString() + " does not support primitive class " + clsP.getName());
                }
                if (!((Boolean) vf11.d.get(tpa0Var.o())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + tpa0Var.o());
                }
                ohc ohcVarP = tpa0Var.p();
                try {
                    k9 k9VarW = o5Var.w();
                    u8 u8VarJ1 = k9VarW.j1(ohcVarP);
                    k9VarW.u1(u8VarJ1);
                    u8Var = (u8) k9VarW.H0(u8VarJ1);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) o5Var.w().b).getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bArrC = u8Var.c();
        byte[] bArrA = this.b.a(bArrC, c);
        byte[] bArrA2 = ((s82) vf11.c(this.a.o(), bArrC)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((s82) vf11.c(this.a.o(), this.b.b(bArr3, c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
