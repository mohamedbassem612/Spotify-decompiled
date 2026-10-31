package p;

import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aw81 implements Comparable {
    public static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public aw81(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009f A[PHI: r2
      0x009f: PHI (r2v15 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x0095, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    public static aw81 b(File file, long j, long j2, toj0 toj0Var) {
        File file2;
        long j3;
        String strGroup;
        File fileE;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = h.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                strGroup.getClass();
                String str = zoi1.a;
                int length = strGroup.length();
                int iEnd = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (strGroup.charAt(i3) == '%') {
                        i2++;
                    }
                }
                if (i2 != 0) {
                    int i4 = length - (i2 * 2);
                    StringBuilder sb = new StringBuilder(i4);
                    Matcher matcher2 = zoi1.e.matcher(strGroup);
                    while (i2 > 0 && matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        char c = (char) Integer.parseInt(strGroup2, 16);
                        sb.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb.append(c);
                        iEnd = matcher2.end();
                        i2--;
                    }
                    if (iEnd < length) {
                        sb.append((CharSequence) strGroup, iEnd, length);
                    }
                    if (sb.length() != i4) {
                        strGroup = null;
                    } else {
                        strGroup = sb.toString();
                    }
                }
            } else {
                matcher = g.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileE = null;
            } else {
                File parentFile = file.getParentFile();
                parentFile.getClass();
                int i5 = toj0Var.q(strGroup).a;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j4 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileE = e(parentFile, i5, j4, Long.parseLong(strGroup4));
                if (!file.renameTo(fileE)) {
                    fileE = null;
                }
            }
            if (fileE != null) {
                file2 = fileE;
                name = fileE.getName();
            }
            return null;
        }
        file2 = file;
        Matcher matcher3 = i.matcher(name);
        if (matcher3.matches()) {
            String strGroup5 = matcher3.group(1);
            strGroup5.getClass();
            String str2 = (String) ((SparseArray) toj0Var.c).get(Integer.parseInt(strGroup5));
            if (str2 != null) {
                long length2 = j == -1 ? file2.length() : j;
                if (length2 != 0) {
                    String strGroup6 = matcher3.group(2);
                    strGroup6.getClass();
                    long j5 = Long.parseLong(strGroup6);
                    if (j2 == -9223372036854775807L) {
                        String strGroup7 = matcher3.group(3);
                        strGroup7.getClass();
                        j3 = Long.parseLong(strGroup7);
                    } else {
                        j3 = j2;
                    }
                    return new aw81(str2, j5, length2, j3, file2);
                }
            }
        }
        return null;
    }

    public static aw81 c(File file, long j, toj0 toj0Var) {
        return b(file, j, -9223372036854775807L, toj0Var);
    }

    public static aw81 d(long j, long j2, String str) {
        return new aw81(str, j, j2, -9223372036854775807L, null);
    }

    public static File e(File file, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, pze0.h(j2, ".v3.exo", sb));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(aw81 aw81Var) {
        String str = aw81Var.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(aw81Var.a);
        }
        long j = this.b - aw81Var.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.b);
        sb.append(", ");
        return pze0.h(this.c, "]", sb);
    }
}
