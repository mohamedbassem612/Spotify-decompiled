package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wfo1 extends pfo1 {
    public final Object a;

    public wfo1(Object obj) {
        this.a = obj;
    }

    @Override // p.pfo1
    public final Object a(Object obj) {
        if (obj != null) {
            return this.a;
        }
        bhn0.i("use Optional.orNull() instead of Optional.or(null)");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wfo1) {
            return this.a.equals(((wfo1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.a.toString();
        return l1d.q(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }
}
