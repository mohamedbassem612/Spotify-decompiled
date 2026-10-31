package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cpb implements wav0 {
    public final boolean a;

    public cpb(boolean z) {
        this.a = z;
    }

    @Override // p.wav0
    public final String a() {
        return String.valueOf(this.a);
    }

    @Override // p.wav0
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpb) && this.a == ((cpb) obj).a;
    }

    @Override // p.wav0
    public final String getPolicyId() {
        return "/remote-config/device-is-tablet";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
