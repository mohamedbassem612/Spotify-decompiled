package p;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s1c0 implements qdt0 {
    public final View a;
    public final oj80 b;
    public r1c0 e;
    public x6e1 f;
    public e8k1 g;
    public Rect l;
    public final a0c0 m;
    public iu30 c = new pv40((byte) 24);
    public iu30 d = new pv40((byte) 25);
    public c8e1 h = new c8e1(nbe1.b, 4, "");
    public x180 i = x180.g;
    public final ArrayList j = new ArrayList();
    public final znb0 k = dm5.S(3, new g030(this, (byte) 15));

    public s1c0(View view, ll4 ll4Var, oj80 oj80Var) {
        this.a = view;
        this.b = oj80Var;
        this.m = new a0c0(ll4Var, oj80Var);
    }

    @Override // p.qdt0
    public final InputConnection a(EditorInfo editorInfo) {
        c8e1 c8e1Var = this.h;
        prn1.y(editorInfo, c8e1Var.a.b, c8e1Var.b, this.i);
        c1c0 c1c0Var = d1c0.a;
        if (a4x.d()) {
            a4x.a().j(editorInfo);
        }
        x311 x311Var = new x311(this.h, new zc80(this, (byte) 7), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(x311Var));
        return x311Var;
    }
}
