package p;

import com.google.android.recaptcha.internal.zzah;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ccm1 implements hj71, agp1, v0i {
    public static final /* synthetic */ ccm1 a = new ccm1();
    public static final /* synthetic */ ccm1 b = new ccm1();

    public static nnn1 a(final long j) {
        return nnn1.f(new ghn1() { // from class: p.a3p1
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((ejn1) obj).a.e(nnn1.b(j));
                    return Optional.empty();
                } catch (zzah unused) {
                    return Optional.of(ctn1.b);
                }
            }
        });
    }

    public static void b(long j, yrg0 yrg0Var, boolean z) throws IOException {
        long[] jArr = {1527337001, 959997459, 671305984, 289023511, 8866124, 1524543404, 741858923, 1040759385, 213594814};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        long j10 = (((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + j8;
        long j11 = j9 % 213594814;
        long j12 = z ? (j + j) ^ (j >> 63) : j;
        int i = 1;
        while (true) {
            long j13 = j10 ^ j11;
            long j14 = j12 >>> 7;
            boolean z2 = j14 != 0 || i < 0;
            int i2 = (int) (j12 & j13);
            if (z2) {
                i2 = ((i2 | 128) << 24) >> 24;
            }
            ((ByteArrayOutputStream) yrg0Var.b).write((byte) i2);
            if (!z2) {
                return;
            }
            i++;
            j12 = j14;
        }
    }

    public Object m(dxy dxyVar) {
        return new qbo1((byte) 0);
    }

    public Object n(k371 k371Var, lnm lnmVar) {
        wa71 wa71Var = k371Var.a;
        if (wa71Var == null) {
            return null;
        }
        z771 z771VarP = tyo1.p(blc0.mg, new String[0]);
        rhy rhyVar = new rhy((yny) null, 63);
        dz61 dz61Var = dz61.d;
        return new qj71(Collections.singletonList(new u771(new t771(wa71Var, z771VarP), new pz61(new y171(rc11.a.b(zwy.class)), new exy((String) null, m1f1.a, 0, false, rhyVar, (bwe1) null, (cuu0) null), az61.d, false), new bj71(w7x.a, true, (String) null))), 0, puk.d);
    }
}
