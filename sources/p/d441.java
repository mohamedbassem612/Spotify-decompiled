package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface d441 extends AutoCloseable {
    void K(int i, String str);

    String P0(int i);

    boolean f1();

    byte[] getBlob(int i);

    default boolean getBoolean() {
        return getLong(0) != 0;
    }

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    void n(byte[] bArr, int i);

    void r(int i, long j);

    void reset();

    void s(double d, int i);

    void t(int i);

    void x();
}
