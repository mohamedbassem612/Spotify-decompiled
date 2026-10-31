package p;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k3s extends zw81 {
    public static TimeInterpolator s;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f61p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();

    @Override // p.e611
    public final boolean c(w611 w611Var, List list) {
        return !list.isEmpty() || super.c(w611Var, list);
    }

    @Override // p.e611
    public final void f(w611 w611Var) {
        View view = w611Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j3s) arrayList.get(size)).a == w611Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                d(w611Var);
                arrayList.remove(size);
            }
        }
        q(this.k, w611Var);
        if (this.h.remove(w611Var)) {
            view.setAlpha(1.0f);
            d(w611Var);
        }
        if (this.i.remove(w611Var)) {
            view.setAlpha(1.0f);
            d(w611Var);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            q(arrayList3, w611Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((j3s) arrayList5.get(size4)).a == w611Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    d(w611Var);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(w611Var)) {
                view.setAlpha(1.0f);
                d(w611Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(w611Var);
        this.o.remove(w611Var);
        this.r.remove(w611Var);
        this.f61p.remove(w611Var);
        p();
    }

    @Override // p.e611
    public final void g() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j3s j3sVar = (j3s) arrayList.get(size);
            View view = j3sVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            d(j3sVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((w611) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            w611 w611Var = (w611) arrayList3.get(size3);
            w611Var.a.setAlpha(1.0f);
            d(w611Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            i3s i3sVar = (i3s) arrayList4.get(size4);
            w611 w611Var2 = i3sVar.a;
            if (w611Var2 != null) {
                r(i3sVar, w611Var2);
            }
            w611 w611Var3 = i3sVar.b;
            if (w611Var3 != null) {
                r(i3sVar, w611Var3);
            }
        }
        arrayList4.clear();
        if (i()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    j3s j3sVar2 = (j3s) arrayList6.get(size6);
                    View view2 = j3sVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    d(j3sVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    w611 w611Var4 = (w611) arrayList8.get(size8);
                    w611Var4.a.setAlpha(1.0f);
                    d(w611Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    i3s i3sVar2 = (i3s) arrayList10.get(size10);
                    w611 w611Var5 = i3sVar2.a;
                    if (w611Var5 != null) {
                        r(i3sVar2, w611Var5);
                    }
                    w611 w611Var6 = i3sVar2.b;
                    if (w611Var6 != null) {
                        r(i3sVar2, w611Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            o(this.q);
            o(this.f61p);
            o(this.o);
            o(this.r);
            e();
        }
    }

    @Override // p.e611
    public final boolean i() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.f61p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // p.e611
    public final void j() {
        long j = this.d;
        ArrayList<w611> arrayList = this.h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        for (w611 w611Var : arrayList) {
            View view = w611Var.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.q.add(w611Var);
            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new f3s(this, w611Var, viewPropertyAnimatorAnimate, view)).start();
            arrayList = arrayList;
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.m.add(arrayList5);
            arrayList2.clear();
            Runnable e3sVar = new e3s(this, arrayList5, (byte) 0);
            if (zIsEmpty) {
                e3sVar.run();
            } else {
                View view2 = ((j3s) arrayList5.get(0)).a.a;
                WeakHashMap weakHashMap = b8k1.a;
                view2.postOnAnimationDelayed(e3sVar, j);
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.n.add(arrayList6);
            arrayList3.clear();
            Runnable nx30Var = new nx30(this, arrayList6, false, (byte) 17);
            if (zIsEmpty) {
                nx30Var.run();
            } else {
                View view3 = ((i3s) arrayList6.get(0)).a.a;
                WeakHashMap weakHashMap2 = b8k1.a;
                view3.postOnAnimationDelayed(nx30Var, j);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.l.add(arrayList7);
        arrayList4.clear();
        Runnable e3sVar2 = new e3s(this, arrayList7, (byte) 1);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            e3sVar2.run();
            return;
        }
        if (zIsEmpty) {
            j = 0;
        }
        long jMax = Math.max(!zIsEmpty2 ? this.e : 0L, zIsEmpty3 ? 0L : this.f) + j;
        View view4 = ((w611) arrayList7.get(0)).a;
        WeakHashMap weakHashMap3 = b8k1.a;
        view4.postOnAnimationDelayed(e3sVar2, jMax);
    }

    @Override // p.zw81
    public final void k(w611 w611Var) {
        s(w611Var);
        w611Var.a.setAlpha(0.0f);
        this.i.add(w611Var);
    }

    @Override // p.zw81
    public final boolean l(w611 w611Var, w611 w611Var2, int i, int i2, int i3, int i4) {
        if (w611Var == w611Var2) {
            return m(w611Var, i, i2, i3, i4);
        }
        View view = w611Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        s(w611Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = w611Var2.a;
        s(w611Var2);
        view2.setTranslationX(-((int) ((i3 - i) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i2) - translationY)));
        view2.setAlpha(0.0f);
        this.k.add(new i3s(w611Var, w611Var2, i, i2, i3, i4));
        return true;
    }

    @Override // p.zw81
    public final boolean m(w611 w611Var, int i, int i2, int i3, int i4) {
        View view = w611Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) w611Var.a.getTranslationY());
        s(w611Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            d(w611Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.j.add(new j3s(w611Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // p.zw81
    public final void n(w611 w611Var) {
        s(w611Var);
        this.h.add(w611Var);
    }

    public final void o(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((w611) arrayList.get(size)).a.animate().cancel();
        }
    }

    public final void p() {
        if (i()) {
            return;
        }
        e();
    }

    public final void q(ArrayList arrayList, w611 w611Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i3s i3sVar = (i3s) arrayList.get(size);
            if (r(i3sVar, w611Var) && i3sVar.a == null && i3sVar.b == null) {
                arrayList.remove(i3sVar);
            }
        }
    }

    public final boolean r(i3s i3sVar, w611 w611Var) {
        if (i3sVar.b == w611Var) {
            i3sVar.b = null;
        } else {
            if (i3sVar.a != w611Var) {
                return false;
            }
            i3sVar.a = null;
        }
        View view = w611Var.a;
        View view2 = w611Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        d(w611Var);
        return true;
    }

    public final void s(w611 w611Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        w611Var.a.animate().setInterpolator(s);
        f(w611Var);
    }
}
