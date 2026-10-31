package p;

import com.spotify.eventsender.Fragment;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w680 implements xu30 {
    public final s900 a;
    public final t561 b;
    public final ac00 c;
    public final AtomicLong d = new AtomicLong();

    public w680(s900 s900Var, ac00 ac00Var, t561 t561Var) {
        this.a = s900Var;
        this.b = t561Var;
        this.c = ac00Var;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n700 invoke(String str, byte[] bArr, byte[] bArr2) {
        long jA = this.b.a(2, str, bArr2);
        this.c.getClass();
        h290<Fragment> h290VarQ = q1o1.e(bArr, ac00.a(), this.a).q();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
        for (Fragment fragment : h290VarQ) {
            arrayList.add(oqn1.n(fragment.getName(), fragment.getData()));
        }
        return new n700(this.d.getAndIncrement(), str, phc.e(0, bArr2, bArr2.length), jA, arrayList, true);
    }
}
