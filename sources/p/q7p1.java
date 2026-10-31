package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q7p1 implements r7p1 {
    public static final q7p1 a;
    public static final /* synthetic */ q7p1[] b;

    static {
        q7p1 q7p1Var = new q7p1("INSTANCE", 0);
        a = q7p1Var;
        b = new q7p1[]{q7p1Var};
    }

    public static q7p1[] values() {
        return (q7p1[]) b.clone();
    }

    @Override // p.r7p1
    public final /* synthetic */ long a(byte[] bArr, int i) {
        if (ordinal() != 0) {
            throw null;
        }
        byte b2 = bArr[i + 7];
        return ((((long) bArr[i + 6]) & 255) << 48) | ((b2 & 255) << 56) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255);
    }
}
