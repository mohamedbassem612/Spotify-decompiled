package p;

import android.content.Intent;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class nze0 implements Update {
    public static final nze0 a = new nze0();

    public final Next a(Object obj, Object obj2) {
        qze0 qze0Var = (qze0) obj;
        kze0 kze0Var = (kze0) obj2;
        if (kze0Var.equals(fze0.a)) {
            return Next.a(Collections.singleton(vye0.c));
        }
        if (kze0Var instanceof jze0) {
            jze0 jze0Var = (jze0) kze0Var;
            return qze0Var.i ? Next.h(qze0.a(qze0Var, 0, 3, false, 447)) : Next.i(qze0.a(qze0Var, 2, 0, false, 479), Collections.singleton(new uye0(jze0Var.a, jze0Var.c)));
        }
        if (kze0Var.equals(eze0.a)) {
            return Next.h(qze0.a(qze0Var, 1, 2, false, 287));
        }
        if (kze0Var.equals(ize0.a)) {
            Intent intent = qze0Var.e;
            return intent != null ? Next.a(Collections.singleton(new wye0(intent))) : Next.j();
        }
        if (!(kze0Var instanceof hze0)) {
            if (kze0Var.equals(gze0.a)) {
                return Next.h(qze0.a(qze0Var, 0, 1, false, 319));
            }
            eg.o();
            return null;
        }
        hze0 hze0Var = (hze0) kze0Var;
        String str = hze0Var.a;
        String str2 = hze0Var.c;
        qze0 qze0VarA = qze0.a(qze0Var, 2, 0, true, 351);
        return qze0VarA.i ? Next.h(qze0.a(qze0VarA, 0, 3, false, 447)) : Next.i(qze0.a(qze0VarA, 2, 0, false, 479), Collections.singleton(new uye0(str, str2)));
    }
}
