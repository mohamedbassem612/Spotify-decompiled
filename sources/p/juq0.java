package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class juq0 implements a4l {
    public final g3e a;
    public final yds b;
    public final l7s c;

    public juq0(g3e g3eVar, yds ydsVar, l7s l7sVar) {
        this.a = g3eVar;
        this.b = ydsVar;
        this.c = l7sVar;
    }

    @Override // p.a4l
    public final void a() {
        if (((iuq0) this.a).b()) {
            l7s l7sVar = this.c;
            Objects.toString(l7sVar.a);
            l7sVar.a = null;
            l7sVar.b.m((Object) null, Boolean.FALSE);
            this.b.a();
        }
    }

    @Override // p.a4l
    public final void b() {
        if (((iuq0) this.a).b()) {
            this.b.b();
        }
    }
}
