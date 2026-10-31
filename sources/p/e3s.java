package p;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e3s implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ k3s c;

    public /* synthetic */ e3s(k3s k3sVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = k3sVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    k3s k3sVar = this.c;
                    if (!zHasNext) {
                        arrayList.clear();
                        k3sVar.m.remove(arrayList);
                    } else {
                        j3s j3sVar = (j3s) it.next();
                        w611 w611Var = j3sVar.a;
                        int i = j3sVar.b;
                        int i2 = j3sVar.c;
                        int i3 = j3sVar.d;
                        int i4 = j3sVar.e;
                        View view = w611Var.a;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        k3sVar.p.add(w611Var);
                        viewPropertyAnimatorAnimate.setDuration(((e611) k3sVar).e).setListener(new g3s(k3sVar, w611Var, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    k3s k3sVar2 = this.c;
                    if (!zHasNext2) {
                        arrayList.clear();
                        k3sVar2.l.remove(arrayList);
                    } else {
                        w611 w611Var2 = (w611) it2.next();
                        View view2 = w611Var2.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        k3sVar2.o.add(w611Var2);
                        viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(((e611) k3sVar2).c).setListener(new f3s(k3sVar2, w611Var2, view2, viewPropertyAnimatorAnimate2)).start();
                    }
                    break;
                }
                break;
        }
    }
}
