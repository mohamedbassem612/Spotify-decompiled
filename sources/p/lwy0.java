package p;

import android.content.Context;
import android.content.Intent;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lwy0 implements f961 {
    public final Context a;
    public final ne b;
    public final tjq c;
    public final bjx d;
    public final c21 e;
    public final wdm f;
    public final jut g;

    public lwy0(Context context, ne neVar, tjq tjqVar, bjx bjxVar, c21 c21Var, wdm wdmVar, jut jutVar) {
        this.a = context;
        this.b = neVar;
        this.c = tjqVar;
        this.d = bjxVar;
        this.e = c21Var;
        this.f = wdmVar;
        this.g = jutVar;
        try {
            List listK = w081.k(context, 2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listK) {
                Intent[] intentArr = ((t081) obj).c;
                if (intentArr[intentArr.length - 1].filterEquals(new Intent("android.intent.action.VIEW"))) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                Context context2 = this.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((t081) it.next()).b);
                }
                w081.w(context2, arrayList2);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p.dwo
    public final void shutdown() {
        Disposable disposable = (Disposable) this.b.e;
        if (disposable != null) {
            disposable.dispose();
        }
        this.c.l();
        this.d.s();
        this.e.m();
        this.f.l();
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
