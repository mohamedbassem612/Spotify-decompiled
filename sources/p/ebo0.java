package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ebo0 implements CharSequence {
    public final CharSequence a;

    public ebo0(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return (char) 8226;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }
}
