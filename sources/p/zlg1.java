package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class zlg1 implements Update {
    public static final zlg1 a = new zlg1();

    public final Next a(Object obj, Object obj2) {
        bmg1 bmg1Var = (bmg1) obj;
        ylg1 ylg1Var = (ylg1) obj2;
        String str = bmg1Var.f;
        yq00 yq00Var = bmg1Var.i;
        String str2 = bmg1Var.g;
        boolean z = bmg1Var.b;
        if (ylg1Var instanceof rlg1) {
            return Next.a(Collections.singleton(new mlg1(str2, ((rlg1) ylg1Var).a, z)));
        }
        boolean zEquals = ylg1Var.equals(tlg1.b);
        hmg1 hmg1Var = hmg1.a;
        if (zEquals) {
            return Next.i(bmg1.a(bmg1Var, 0L, null, null, hmg1Var, 383), Collections.singleton(llg1.b));
        }
        if (ylg1Var instanceof ulg1) {
            ulg1 ulg1Var = (ulg1) ylg1Var;
            return Next.h(bmg1.a(bmg1Var, ulg1Var.b, ulg1Var.a, null, hmg1Var, 335));
        }
        if (ylg1Var instanceof vlg1) {
            if (u890.j(bmg1Var.h, hmg1Var)) {
                long j = bmg1Var.e;
                if (j > 0) {
                    long j2 = j - 1;
                    return j2 > 0 ? Next.h(bmg1.a(bmg1Var, j2, null, null, null, 495)) : Next.h(bmg1.a(bmg1Var, -1L, null, null, img1.a, 367));
                }
            }
            return Next.j();
        }
        if (ylg1Var instanceof wlg1) {
            yig1 yig1Var = bmg1Var.c;
            if (z && (yig1Var instanceof wig1)) {
                return Next.a(Collections.singleton(new qlg1(((wig1) yig1Var).a)));
            }
            return z ? Next.a(Collections.singleton(plg1.b)) : Next.a(Collections.singleton(olg1.b));
        }
        if (ylg1Var instanceof xlg1) {
            xlg1 xlg1Var = (xlg1) ylg1Var;
            String str3 = xlg1Var.b;
            if (!xlg1Var.a.equals(str)) {
                return Next.j();
            }
            if (bmg1Var.d) {
                return Next.i(bmg1.a(bmg1Var, 0L, null, str3, null, 447), Collections.singleton(new nlg1(str3, z, yq00Var)));
            }
            return z ? Next.h(bmg1.a(bmg1Var, 0L, null, str3, emg1.a, 319)) : Next.i(bmg1.a(bmg1Var, 0L, null, str3, null, 447), Collections.singleton(new nlg1(str3, false, yq00Var)));
        }
        if (ylg1Var instanceof slg1) {
            String str4 = ((slg1) ylg1Var).a;
            return (str4 == null || str4.equals(str)) ? Next.h(bmg1.a(bmg1Var, 0L, null, null, gmg1.a, 383)) : Next.j();
        }
        if (ylg1Var.equals(tlg1.a)) {
            return Next.a(Collections.singleton(new nlg1(str2, true, yq00Var)));
        }
        eg.o();
        return null;
    }
}
