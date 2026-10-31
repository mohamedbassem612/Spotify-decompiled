package p;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jrl1 extends WindowInsetsAnimation.Callback {
    public final jme a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public jrl1(jme jmeVar) {
        super(jmeVar.m0());
        this.d = new HashMap();
        this.a = jmeVar;
    }

    public final mrl1 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        mrl1 mrl1Var = (mrl1) map.get(windowInsetsAnimation);
        if (mrl1Var != null) {
            return mrl1Var;
        }
        mrl1 mrl1VarG = mrl1.g(windowInsetsAnimation);
        map.put(windowInsetsAnimation, mrl1VarG);
        return mrl1VarG;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.r0(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.s0(a(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationI = t8e1.i(list.get(size));
            mrl1 mrl1VarA = a(windowInsetsAnimationI);
            mrl1VarA.f(windowInsetsAnimationI.getFraction());
            this.c.add(mrl1VarA);
        }
        return this.a.t0(hsl1.g(null, windowInsets), this.b).f();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        return this.a.u0(a(windowInsetsAnimation), frl1.f(bounds)).e();
    }
}
