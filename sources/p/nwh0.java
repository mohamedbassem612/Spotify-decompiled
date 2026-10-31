package p;

import android.os.Build;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nwh0 implements zj {
    public final ynb0 a;
    public final o4o0 b;
    public final o7s c;
    public final fwo d;
    public final q8n e;
    public final bpb1 f;
    public llm g;
    public zob1 h;
    public final bpb1 i;

    public nwh0(ynb0 ynb0Var, o4o0 o4o0Var, o7s o7sVar, fwo fwoVar, q8n q8nVar) {
        this.a = ynb0Var;
        this.b = o4o0Var;
        this.c = o7sVar;
        this.d = fwoVar;
        this.e = q8nVar;
        bpb1 bpb1VarB = gio1.b(z6x.a);
        this.f = bpb1VarB;
        this.i = bpb1VarB;
    }

    @Override // p.zj
    public final void a() {
        this.f.m((Object) null, z6x.a);
        llm llmVar = this.g;
        if (llmVar != null) {
            smo1.q(llmVar);
        } else {
            u890.C("scope");
            throw null;
        }
    }

    @Override // p.zj
    public final void b() {
        this.g = cy30.t(this.e);
        tzf0 tzf0Var = new tzf0(this, (byte) 26);
        if (Build.VERSION.SDK_INT >= 34) {
            tzf0Var.invoke();
        } else {
            Logger.d("MediaRouter2 is not supported on this device", new Object[0]);
        }
    }

    @Override // p.zj
    public final mr20 d() {
        return this.i;
    }
}
