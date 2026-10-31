package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zm70 implements vav0 {
    public final String a;

    public zm70(String str) {
        this.a = str;
    }

    @Override // p.wav0
    public final String a() {
        return this.a;
    }

    @Override // p.wav0
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm70) && u890.j(this.a, ((zm70) obj).a);
    }

    @Override // p.wav0
    public final String getPolicyId() {
        return "/client/spotify-id";
    }

    @Override // p.vav0
    public final String getStringValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
