package p;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class to5 extends lap1 {
    public final /* synthetic */ byte c;

    public static ib00 t(izr0 izr0Var) {
        String strZ = izr0Var.z();
        strZ.getClass();
        String strZ2 = izr0Var.z();
        strZ2.getClass();
        return new ib00(strZ, strZ2, izr0Var.y(), izr0Var.y(), Arrays.copyOfRange(izr0Var.a, izr0Var.b, izr0Var.c));
    }

    public final hjj0 i(gkj0 gkj0Var, ByteBuffer byteBuffer) {
        switch (this.c) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                bae baeVar = new bae(byteBuffer.array(), byteBuffer.limit());
                baeVar.o(12);
                int iD = (baeVar.d() + baeVar.g(12)) - 4;
                baeVar.o(44);
                baeVar.p(baeVar.g(12));
                baeVar.o(16);
                ArrayList arrayList = new ArrayList();
                while (baeVar.d() < iD) {
                    baeVar.o(48);
                    int iG = baeVar.g(8);
                    baeVar.o(4);
                    int iD2 = baeVar.d() + baeVar.g(12);
                    String str = null;
                    String str2 = null;
                    while (baeVar.d() < iD2) {
                        int iG2 = baeVar.g(8);
                        int iG3 = baeVar.g(8);
                        int iD3 = baeVar.d() + iG3;
                        if (iG2 == 2) {
                            int iG4 = baeVar.g(16);
                            baeVar.o(8);
                            if (iG4 == 3) {
                                while (baeVar.d() < iD3) {
                                    int iG5 = baeVar.g(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[iG5];
                                    baeVar.j(bArr, iG5);
                                    String str3 = new String(bArr, charset);
                                    int iG6 = baeVar.g(8);
                                    for (int i = 0; i < iG6; i++) {
                                        baeVar.p(baeVar.g(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (iG2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[iG3];
                            baeVar.j(bArr2, iG3);
                            str2 = new String(bArr2, charset2);
                        }
                        baeVar.m(iD3 * 8);
                    }
                    baeVar.m(iD2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new so5(iG, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new hjj0(arrayList);
            default:
                return new hjj0(t(new izr0(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
