package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class a extends Clock implements Serializable {
    public static final a b;
    private static final long serialVersionUID = 6740630888130243051L;
    public final ZoneId a;

    static {
        System.currentTimeMillis();
        b = new a(ZoneOffset.UTC);
    }

    public a(ZoneId zoneId) {
        this.a = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.Clock
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a);
        }
        return false;
    }

    @Override // j$.time.Clock
    public final ZoneId getZone() {
        return this.a;
    }

    @Override // j$.time.Clock
    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    @Override // j$.time.Clock
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    @Override // j$.time.Clock
    public final long millis() {
        return System.currentTimeMillis();
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }
}
