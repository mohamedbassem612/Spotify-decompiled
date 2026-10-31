package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f790 implements h790 {
    public final boolean a;

    public f790(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f790) && this.a == ((f790) obj).a;
    }

    @Override // p.h790
    public final String getName() {
        return "local_playback_provider_state_changed";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
