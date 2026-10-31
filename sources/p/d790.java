package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d790 implements h790 {
    public final boolean a;

    public d790(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d790) && this.a == ((d790) obj).a;
    }

    @Override // p.h790
    public final String getName() {
        return "car_connection_type_changed";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
