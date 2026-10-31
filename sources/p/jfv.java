package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jfv implements Comparable {
    public static final ytw0 b = new ytw0((byte) 13);
    public static final long c = fdg1.t(4611686018427387903L);
    public static final long d = fdg1.t(-4611686018427387903L);
    public static final long e = 9223372036854759646L;
    public final long a;

    public static final long a(long j, long j2) {
        long jY = fdg1.y(j2);
        long jR = fdg1.r(j, jY);
        if (-4611686018426L > jR || jR >= 4611686018427L) {
            return fdg1.t(jR);
        }
        return fdg1.v(fdg1.x(jR) + (j2 - fdg1.x(jY)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strF0 = ihc1.F0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strF0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strF0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strF0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strF0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return u890.r(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final double d(long j, long j2) {
        ngv ngvVar = (ngv) pap1.y(m(j), m(j2));
        return s(j, ngvVar) / s(j2, ngvVar);
    }

    public static final long e(long j) {
        if ((((int) j) & 1) == 0) {
            return fdg1.v((j >> 1) / 2);
        }
        if (n(j)) {
            return r(Integer.signum(2), j);
        }
        long j2 = j >> 1;
        long j3 = j2 / 2;
        if (-4611686018426L > j3 || j3 >= 4611686018427L) {
            return fdg1.t(j3);
        }
        return fdg1.v(fdg1.x(j3) + (fdg1.x(j2 - (j3 * 2)) / 2));
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final int g(long j) {
        if (n(j)) {
            return 0;
        }
        return (int) (u(j, ngv.HOURS) % 24);
    }

    public static final long h(long j) {
        return ((((int) j) & 1) != 1 || n(j)) ? u(j, ngv.MILLISECONDS) : j >> 1;
    }

    public static final long i(long j) {
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            return j2;
        }
        if (j2 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j2 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return fdg1.x(j2);
    }

    public static final int j(long j) {
        if (n(j)) {
            return 0;
        }
        return (int) (u(j, ngv.MINUTES) % 60);
    }

    public static final int k(long j) {
        if (n(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? fdg1.x((j >> 1) % 1000) : (j >> 1) % 1000000000);
    }

    public static final int l(long j) {
        if (n(j)) {
            return 0;
        }
        return (int) (u(j, ngv.SECONDS) % 60);
    }

    public static final ngv m(long j) {
        return (((int) j) & 1) == 0 ? ngv.NANOSECONDS : ngv.MILLISECONDS;
    }

    public static final boolean n(long j) {
        return j == c || j == d;
    }

    public static final boolean o(long j) {
        return j > 0;
    }

    public static final long p(long j, long j2) {
        return q(j, w(j2));
    }

    public static final long q(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            return fdg1.w((j >> 1) + (j2 >> 1));
        }
        long jR = fdg1.r(j >> 1, j2 >> 1);
        if (jR != 9223372036854759646L) {
            return (jR == 4611686018427387903L || jR == -4611686018427387903L) ? fdg1.t(jR) : fdg1.u(jR);
        }
        hhg1.n("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if ((java.lang.Integer.signum(r18) * java.lang.Long.signum(r6)) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if ((java.lang.Integer.signum(r18) * java.lang.Long.signum(r6)) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        return p.jfv.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        return p.jfv.d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long r(int r18, long r19) {
        /*
            r0 = r18
            r1 = r19
            boolean r3 = n(r1)
            if (r3 == 0) goto L1c
            if (r0 == 0) goto L14
            if (r0 <= 0) goto Lf
            return r1
        Lf:
            long r0 = w(r1)
            return r0
        L14:
            java.lang.String r0 = "Multiplying infinite duration by zero yields an undefined result."
            p.hhg1.n(r0)
            r0 = 0
            return r0
        L1c:
            r3 = 0
            if (r0 != 0) goto L21
            return r3
        L21:
            r5 = 1
            long r6 = r1 >> r5
            long r8 = (long) r0
            long r10 = r6 * r8
            int r1 = (int) r1
            r1 = r1 & r5
            r12 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r14 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r1 != 0) goto L8e
            r1 = -2147483647(0xffffffff80000001, double:NaN)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto L4a
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L4a
            long r0 = p.fdg1.v(r10)
            return r0
        L4a:
            long r1 = r10 / r8
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L55
            long r0 = p.fdg1.w(r10)
            return r0
        L55:
            long r1 = p.fdg1.y(r6)
            long r10 = p.fdg1.x(r1)
            long r10 = r6 - r10
            long r16 = r1 * r8
            long r10 = r10 * r8
            long r10 = p.fdg1.y(r10)
            long r10 = r10 + r16
            long r8 = r16 / r8
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L82
            long r1 = r10 ^ r16
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L82
            p.n5f0 r0 = new p.n5f0
            r0.<init>(r14, r12)
            long r0 = p.yoi1.s(r10, r0)
            long r0 = p.fdg1.t(r0)
            return r0
        L82:
            int r1 = java.lang.Long.signum(r6)
            int r0 = java.lang.Integer.signum(r0)
            int r0 = r0 * r1
            if (r0 <= 0) goto Lb0
            goto Lad
        L8e:
            long r1 = r10 / r8
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto La2
            p.n5f0 r0 = new p.n5f0
            r0.<init>(r14, r12)
            long r0 = p.yoi1.s(r10, r0)
            long r0 = p.fdg1.t(r0)
            return r0
        La2:
            int r1 = java.lang.Long.signum(r6)
            int r0 = java.lang.Integer.signum(r0)
            int r0 = r0 * r1
            if (r0 <= 0) goto Lb0
        Lad:
            long r0 = p.jfv.c
            return r0
        Lb0:
            long r0 = p.jfv.d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jfv.r(int, long):long");
    }

    public static final double s(long j, ngv ngvVar) {
        if (j == c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == d) {
            return Double.NEGATIVE_INFINITY;
        }
        return fj30.w(j >> 1, m(j), ngvVar);
    }

    public static final int t(long j, ngv ngvVar) {
        return (int) yoi1.r(u(j, ngvVar), -2147483648L, 2147483647L);
    }

    public static final long u(long j, ngv ngvVar) {
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        return fj30.x(j >> 1, m(j), ngvVar);
    }

    public static String v(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == d) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = w(j);
        }
        long jU = u(j, ngv.DAYS);
        int iG = g(j);
        int iJ = j(j);
        int iL = l(j);
        int iK = k(j);
        boolean z2 = jU != 0;
        boolean z3 = iG != 0;
        boolean z4 = iJ != 0;
        boolean z5 = (iL == 0 && iK == 0) ? false : true;
        if (z2) {
            sb.append(jU);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iG);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iJ);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iL != 0 || z2 || z3 || z4) {
                b(sb, iL, iK, 9, "s", false);
            } else if (iK >= 1000000) {
                b(sb, iK / 1000000, iK % 1000000, 6, "ms", false);
            } else if (iK >= 1000) {
                b(sb, iK / 1000, iK % 1000, 3, "us", false);
            } else {
                sb.append(iK);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long w(long j) {
        return fdg1.s(((int) j) & 1, -(j >> 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.a, ((jfv) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jfv) {
            return this.a == ((jfv) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return v(this.a);
    }
}
