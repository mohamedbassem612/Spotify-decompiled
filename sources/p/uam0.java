package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uam0 implements l5r0, ihr0, lqb1 {
    public final i8l a;
    public final n7e0 b;
    public final Object c;
    public final t7e0 d;
    public final m4h1 e = new m4h1(new awj(this, (byte) 4));
    public Bundle f;
    public MobiusLoop.Controller g;

    public uam0(i8l i8lVar, n7e0 n7e0Var, Object obj, t7e0 t7e0Var) {
        this.a = i8lVar;
        this.b = n7e0Var;
        this.c = obj;
        this.d = t7e0Var;
    }

    public final boolean b(ehr0 ehr0Var) {
        return this.e.b(ehr0Var);
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e.c(context, layoutInflater, viewGroup);
    }

    public final void d(Bundle bundle) {
        this.f = bundle.getBundle("mobius-model");
        bundle.getBundle("delegate-state");
    }

    public final void e(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e.e(context, bundle, layoutInflater, viewGroup);
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putBundle("delegate-state", this.e.f());
        MobiusLoop.Controller controller = this.g;
        Object objA = controller != null ? controller.a() : null;
        iu30 iu30Var = this.b.d;
        if (objA != null && iu30Var != null) {
            bundle.putBundle("mobius-model", (Bundle) iu30Var.invoke(objA));
        }
        return bundle;
    }

    public final View getView() {
        return this.e.getView();
    }

    public final void start() {
        m4h1 m4h1Var = this.e;
        m4h1Var.start();
        f4h1 f4h1Var = m4h1Var.b;
        h8l h8lVar = f4h1Var instanceof h8l ? (h8l) f4h1Var : null;
        if (h8lVar != null) {
            n7e0 n7e0Var = this.b;
            vu30 vu30Var = n7e0Var.a;
            t7e0 t7e0Var = this.d;
            Object obj = this.c;
            MobiusLoop.Controller controllerB = MobiusAndroid.b((MobiusLoop.Factory) vu30Var.invoke(obj, t7e0Var), n7e0Var.b.invoke(obj, this.f), n7e0Var.c);
            controllerB.c(h8lVar);
            controllerB.start();
            this.g = controllerB;
        }
    }

    public final void stop() {
        MobiusLoop.Controller controller;
        m4h1 m4h1Var = this.e;
        f4h1 f4h1Var = m4h1Var.b;
        if ((f4h1Var instanceof h8l ? (h8l) f4h1Var : null) != null && (controller = this.g) != null) {
            controller.stop();
            controller.disconnect();
        }
        m4h1Var.stop();
    }
}
