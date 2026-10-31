package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class efi1 extends gfi1 {
    public final String a;

    public efi1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efi1) && this.a.equals(((efi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
