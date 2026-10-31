package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cn0 implements yw0 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;

    public cn0(t1r t1rVar, hld hldVar, q8n q8nVar) {
        this.b = t1rVar;
        this.c = hldVar;
        this.d = smo1.e(q8nVar);
    }

    public final void start() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                llm llmVar = (llm) obj2;
                l4p1.u(llmVar, new lt20(new fu20(rqt0.u(yoi1.g(((t1r) obj).c())), new j1(2, (hld) obj3, hld.class, "setAudioDataSaver", "setAudioDataSaver(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 2), (byte) 1), new jk(3, (lnm) null, (byte) 2), (byte) 0));
                break;
            default:
                if (!xoi1.b(((x15) obj3).a.getApplicationContext()) || ((j44) obj2).i()) {
                    Iterator it = ((Set) obj).iterator();
                    while (it.hasNext()) {
                        ((tg61) it.next()).a();
                    }
                }
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                smo1.p((llm) obj, null);
                break;
            default:
                if (!xoi1.b(((x15) this.c).a.getApplicationContext()) || ((j44) obj).i()) {
                    Iterator it = ((Set) this.b).iterator();
                    while (it.hasNext()) {
                        ((tg61) it.next()).end();
                    }
                }
                break;
        }
    }

    public cn0(Set set, x15 x15Var, j44 j44Var) {
        this.b = set;
        this.c = x15Var;
        this.d = j44Var;
    }
}
