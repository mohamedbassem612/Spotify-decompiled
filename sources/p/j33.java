package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j33 implements k33 {
    public static final j33 a = new j33();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j33);
    }

    public final String getSessionId() {
        throw new IllegalStateException("Uninitialized session does not have a sessionId");
    }

    public final int hashCode() {
        return 543477918;
    }

    public final String toString() {
        return "Uninitialized";
    }
}
