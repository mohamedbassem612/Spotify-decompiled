package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class mkn0 implements rue0, Serializable {
    public String a;

    @Override // p.rue0
    public String getName() {
        return this.a;
    }

    public Object readResolve() {
        return vue0.c(getName());
    }
}
