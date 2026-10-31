package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class gih0 {
    public final Object a;
    public boolean b;
    public boolean c;
    public byte d;

    public gih0(Object obj) {
        this.a = obj;
    }

    public void a() {
        boolean z = this.b;
        Object obj = this.a;
        if (z) {
            eg.m(gvg.g(obj, "detach() called when detach() had already been called for: "));
        } else if (this.c) {
            eg.m(gvg.g(obj, "detach() called when sendResult() had already been called for: "));
        } else {
            this.b = true;
        }
    }

    public final boolean b() {
        return this.b || this.c;
    }

    public abstract void c(Object obj);

    public final void d(ArrayList arrayList) {
        if (this.c) {
            bhn0.y(this.a, "sendResult() called when either sendResult() or sendError() had already been called for: ");
        } else {
            this.c = true;
            c(arrayList);
        }
    }
}
