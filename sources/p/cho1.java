package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cho1 implements Comparable {
    public int a;
    public long b;
    public long c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return pap1.t(Long.valueOf(this.b), Long.valueOf(((cho1) obj).b));
    }

    public final String toString() {
        String strE0 = ihc1.E0(10, String.valueOf(this.b / ((long) this.a)));
        String strE1 = ihc1.E0(10, String.valueOf(this.c));
        String strE2 = ihc1.E0(10, String.valueOf(this.b));
        String strE3 = ihc1.E0(5, String.valueOf(this.a));
        int length = String.valueOf(strE0).length();
        int length2 = String.valueOf(strE1).length();
        StringBuilder sb = new StringBuilder(length + 41 + length2 + 16 + String.valueOf(strE2).length() + 14 + String.valueOf(strE3).length());
        bb00.j(sb, "avgExecutionTime: ", strE0, " us| maxExecutionTime: ", strE1);
        return rjx.o(sb, " us| totalTime: ", strE2, " us| #Usages: ", strE3);
    }
}
