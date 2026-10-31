package p;

import io.reactivex.rxjava3.subjects.CompletableSubject;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l8s {
    public final zdj0 a;
    public final ynb0 b;
    public final idd1 c = new idd1(new dor(this, (byte) 16));
    public final rku d = new rku();

    public l8s(zdj0 zdj0Var, ynb0 ynb0Var) {
        this.a = zdj0Var;
        this.b = ynb0Var;
    }

    public final CompletableSubject a(String str) {
        CompletableSubject completableSubjectZ = CompletableSubject.z();
        ((n8s) b()).b.b.put(str, completableSubjectZ);
        ((n8s) b()).a.accept(new udj0(str));
        return completableSubjectZ;
    }

    public final aej0 b() {
        return (aej0) this.c.getValue();
    }

    public final SingleSubject c(dio1 dio1Var) {
        SingleSubject singleSubject = new SingleSubject();
        b();
        String strK = mka.k();
        ((n8s) b()).b.a.put(strK, singleSubject);
        ((n8s) b()).a.accept(new wdj0(strK, dio1Var));
        return singleSubject;
    }
}
