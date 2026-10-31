package p;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ajr implements o4a, yeg1 {
    public static final bg11 P0 = b380.v(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final bg11 Q0 = b380.v(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final bg11 R0 = b380.v(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final bg11 S0 = b380.v(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final bg11 T0 = b380.v(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final bg11 U0 = b380.v(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static ajr V0;
    public int N0;
    public String O0;
    public long X;
    public long Y;
    public long Z;
    public final Context a;
    public final j380 b;
    public final kr60 c;
    public final rdd1 d;
    public final boolean e;
    public final vb91 f;
    public int g;
    public long h;
    public long i;
    public long t;

    /* JADX WARN: Type inference failed for: r6v6, types: [p.zir] */
    public ajr(Context context, HashMap map) {
        boolean z;
        rdd1 rdd1Var = rdd1.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.b = j380.c(map);
        this.c = new kr60();
        this.f = new vb91();
        this.d = rdd1Var;
        this.e = true;
        if (context == null) {
            this.N0 = 0;
            this.Y = 1000000L;
            return;
        }
        v8o0 v8o0VarA = v8o0.a(context);
        int iB = v8o0VarA.b();
        this.N0 = iB;
        this.Y = g(iB);
        ?? r6 = new Object() { // from class: p.zir
        };
        Executor executorN = tx9.n();
        CopyOnWriteArrayList<u8o0> copyOnWriteArrayList = (CopyOnWriteArrayList) v8o0VarA.d;
        for (u8o0 u8o0Var : copyOnWriteArrayList) {
            if (u8o0Var.a.get() == null) {
                copyOnWriteArrayList.remove(u8o0Var);
            }
        }
        u8o0 u8o0Var2 = new u8o0(v8o0VarA, r6, executorN);
        synchronized (v8o0VarA.e) {
            ((CopyOnWriteArrayList) v8o0VarA.d).add(u8o0Var2);
            z = v8o0VarA.b;
        }
        if (z) {
            u8o0Var2.b.execute(new gv40(u8o0Var2, (byte) 23));
        }
    }

    public final void a(n4a n4aVar) {
        CopyOnWriteArrayList<m4a> copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.b;
        for (m4a m4aVar : copyOnWriteArrayList) {
            if (m4aVar.b == n4aVar) {
                m4aVar.c = true;
                copyOnWriteArrayList.remove(m4aVar);
            }
        }
    }

    public final void c(Handler handler, n4a n4aVar) {
        handler.getClass();
        n4aVar.getClass();
        kr60 kr60Var = this.c;
        kr60Var.getClass();
        CopyOnWriteArrayList<m4a> copyOnWriteArrayList = (CopyOnWriteArrayList) kr60Var.b;
        for (m4a m4aVar : copyOnWriteArrayList) {
            if (m4aVar.b == n4aVar) {
                m4aVar.c = true;
                copyOnWriteArrayList.remove(m4aVar);
            }
        }
        copyOnWriteArrayList.add(new m4a(handler, n4aVar));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    /* JADX WARN: Code duplicated, block: B:13:0x0017 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x001d  */
    /* JADX WARN: Code duplicated, block: B:22:0x003e A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #2 {all -> 0x007b, blocks: (B:15:0x0019, B:18:0x001e, B:20:0x002a, B:22:0x003e, B:29:0x0069, B:28:0x0060), top: B:47:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0060 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #2 {all -> 0x007b, blocks: (B:15:0x0019, B:18:0x001e, B:20:0x002a, B:22:0x003e, B:29:0x0069, B:28:0x0060), top: B:47:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0017, please report this as an issue */
    public final synchronized void e(o2r o2rVar, n3r n3rVar, boolean z) throws Throwable {
        Throwable th;
        boolean z2;
        long jElapsedRealtime;
        int i;
        long j;
        ajr ajrVar;
        try {
            if (!z) {
                z2 = false;
                if (z2) {
                    dm5.y(this.g > 0);
                    this.d.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    i = (int) (jElapsedRealtime - this.h);
                    this.t += (long) i;
                    long j2 = this.X;
                    j = this.i;
                    this.X = j2 + j;
                    if (i > 0) {
                        this.f.a((j * 8000.0f) / i, (int) Math.sqrt(j));
                        if (this.t < 2000) {
                            this.Y = (long) this.f.i();
                        } else {
                            this.Y = (long) this.f.i();
                        }
                        ajrVar = this;
                        ajrVar.h(i, this.i, this.Y);
                        ajrVar.h = jElapsedRealtime;
                        ajrVar.i = 0L;
                    } else {
                        ajrVar = this;
                    }
                    ajrVar.g--;
                    return;
                }
                return;
            }
            try {
                if (n3rVar.c(8)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    return;
                }
                try {
                    dm5.y(this.g > 0);
                    try {
                        this.d.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        i = (int) (jElapsedRealtime - this.h);
                        this.t += (long) i;
                        long j3 = this.X;
                        j = this.i;
                        this.X = j3 + j;
                        if (i > 0) {
                            this.f.a((j * 8000.0f) / i, (int) Math.sqrt(j));
                            if (this.t < 2000 || this.X >= 524288) {
                                this.Y = (long) this.f.i();
                            }
                            ajrVar = this;
                            ajrVar.h(i, this.i, this.Y);
                            ajrVar.h = jElapsedRealtime;
                            ajrVar.i = 0L;
                        } else {
                            ajrVar = this;
                        }
                        ajrVar.g--;
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th;
    }

    public final synchronized long f() {
        return this.Y;
    }

    /* JADX WARN: Code duplicated, block: B:1148:0x10cf  */
    public final long g(int i) {
        long jLongValue;
        Integer numValueOf = Integer.valueOf(i);
        j380 j380Var = this.b;
        Long lValueOf = (Long) j380Var.get(numValueOf);
        int i2 = 0;
        if (lValueOf == null) {
            lValueOf = (Long) j380Var.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            String str = this.O0;
            if (str == null) {
                str = "";
            }
            switch (str) {
                case "AD":
                case "AI":
                case "BB":
                case "BQ":
                case "CW":
                case "DM":
                case "KN":
                case "KY":
                case "SX":
                case "VC":
                    i2 = 73745;
                    break;
                case "AE":
                    i2 = 50849;
                    break;
                case "AF":
                case "SZ":
                    i2 = 76004;
                    break;
                case "AG":
                case "CI":
                    i2 = 76002;
                    break;
                case "AL":
                    i2 = 74825;
                    break;
                case "AM":
                case "PA":
                    i2 = 75418;
                    break;
                case "AO":
                    i2 = 75555;
                    break;
                case "AQ":
                case "ER":
                case "NU":
                case "SC":
                case "SH":
                    i2 = 74900;
                    break;
                case "AR":
                    i2 = 70802;
                    break;
                case "AS":
                    i2 = 75474;
                    break;
                case "AT":
                case "EE":
                case "HU":
                case "IS":
                case "LV":
                case "MT":
                case "SE":
                    i2 = 65536;
                    break;
                case "AU":
                    i2 = 12888;
                    break;
                case "AW":
                    i2 = 75986;
                    break;
                case "AX":
                case "CX":
                case "LI":
                case "MS":
                case "PM":
                case "SM":
                case "VA":
                    i2 = 74896;
                    break;
                case "AZ":
                case "DJ":
                case "LY":
                case "SL":
                    i2 = 75476;
                    break;
                case "BA":
                case "JO":
                case "TR":
                    i2 = 74313;
                    break;
                case "BD":
                    i2 = 83146;
                    break;
                case "BE":
                    i2 = 69696;
                    break;
                case "BF":
                case "SD":
                case "SY":
                case "TD":
                    i2 = 76060;
                    break;
                case "BG":
                case "PT":
                case "SI":
                    i2 = 69632;
                    break;
                case "BH":
                    i2 = 83545;
                    break;
                case "BI":
                case "GQ":
                case "HT":
                case "NE":
                case "VE":
                case "YE":
                    i2 = 76068;
                    break;
                case "BJ":
                    i2 = 75428;
                    break;
                case "BL":
                case "MP":
                case "PY":
                    i2 = 74897;
                    break;
                case "BM":
                    i2 = 73744;
                    break;
                case "BN":
                    i2 = 73747;
                    break;
                case "BO":
                    i2 = 76049;
                    break;
                case "BR":
                    i2 = 139849;
                    break;
                case "BS":
                    i2 = 74323;
                    break;
                case "BT":
                    i2 = 78987;
                    break;
                case "BW":
                    i2 = 73811;
                    break;
                case "BY":
                    i2 = 75473;
                    break;
                case "BZ":
                case "CK":
                    i2 = 74386;
                    break;
                case "CA":
                case "UA":
                    i2 = 111696;
                    break;
                case "CD":
                case "ML":
                    i2 = 74907;
                    break;
                case "CF":
                    i2 = 75028;
                    break;
                case "CG":
                case "EG":
                case "MG":
                    i2 = 75491;
                    break;
                case "CH":
                    i2 = 65544;
                    break;
                case "CL":
                case "TH":
                    i2 = 74888;
                    break;
                case "CM":
                case "MR":
                    i2 = 75996;
                    break;
                case "CN":
                    i2 = 45634;
                    break;
                case "CO":
                    i2 = 74970;
                    break;
                case "CR":
                case "NI":
                    i2 = 76066;
                    break;
                case "CU":
                case "KI":
                case "NR":
                case "TL":
                    i2 = 76052;
                    break;
                case "CV":
                    i2 = 74266;
                    break;
                case "CY":
                    i2 = 65601;
                    break;
                case "CZ":
                    i2 = 69760;
                    break;
                case "DE":
                    i2 = 42248;
                    break;
                case "DK":
                    i2 = 65664;
                    break;
                case "DO":
                case "LR":
                    i2 = 76067;
                    break;
                case "DZ":
                case "TJ":
                    i2 = 76059;
                    break;
                case "EC":
                    i2 = 74393;
                    break;
                case "ES":
                    i2 = 4096;
                    break;
                case "ET":
                    i2 = 84252;
                    break;
                case "FI":
                    i2 = 66048;
                    break;
                case "FJ":
                    i2 = 75411;
                    break;
                case "FK":
                case "NF":
                case "SJ":
                    i2 = 74899;
                    break;
                case "FM":
                    i2 = 74004;
                    break;
                case "FO":
                    i2 = 73872;
                    break;
                case "FR":
                    i2 = 66121;
                    break;
                case "GA":
                    i2 = 73763;
                    break;
                case "GB":
                    i2 = 74953;
                    break;
                case "GD":
                    i2 = 73746;
                    break;
                case "GE":
                    i2 = 74761;
                    break;
                case "GF":
                    i2 = 75475;
                    break;
                case "GG":
                    i2 = 74320;
                    break;
                case "GH":
                    i2 = 74971;
                    break;
                case "GI":
                case "IM":
                case "JE":
                    i2 = 74256;
                    break;
                case "GL":
                case "MC":
                    i2 = 73873;
                    break;
                case "GM":
                case "SS":
                    i2 = 75932;
                    break;
                case "GN":
                    i2 = 75043;
                    break;
                case "GP":
                    i2 = 75338;
                    break;
                case "GR":
                    i2 = 69633;
                    break;
                case "GT":
                    i2 = 74378;
                    break;
                case "GU":
                    i2 = 79634;
                    break;
                case "GW":
                    i2 = 74852;
                    break;
                case "GY":
                    i2 = 75339;
                    break;
                case "HK":
                    i2 = 4616;
                    break;
                case "HR":
                case "KW":
                    i2 = 65537;
                    break;
                case "ID":
                    i2 = 141003;
                    break;
                case "IE":
                    i2 = 70217;
                    break;
                case "IL":
                    i2 = 83601;
                    break;
                case "IN":
                    i2 = 107721;
                    break;
                case "IO":
                    i2 = 73875;
                    break;
                case "IQ":
                    i2 = 74963;
                    break;
                case "IR":
                    i2 = 116436;
                    break;
                case "IT":
                    i2 = 70728;
                    break;
                case "JM":
                    i2 = 74466;
                    break;
                case "JP":
                    i2 = 83608;
                    break;
                case "KE":
                    i2 = 70227;
                    break;
                case "KG":
                    i2 = 74826;
                    break;
                case "KH":
                    i2 = 75009;
                    break;
                case "KM":
                case "VU":
                    i2 = 74972;
                    break;
                case "KR":
                    i2 = 149648;
                    break;
                case "KZ":
                    i2 = 78986;
                    break;
                case "LA":
                    i2 = 75345;
                    break;
                case "LB":
                    i2 = 74827;
                    break;
                case "LC":
                    i2 = 74322;
                    break;
                case "LK":
                case "MM":
                    i2 = 83667;
                    break;
                case "LS":
                case "PG":
                    i2 = 75484;
                    break;
                case "LT":
                    i2 = 66056;
                    break;
                case "LU":
                    i2 = 103620;
                    break;
                case "MA":
                    i2 = 74331;
                    break;
                case "MD":
                    i2 = 73729;
                    break;
                case "ME":
                    i2 = 78338;
                    break;
                case "MF":
                    i2 = 75409;
                    break;
                case "MH":
                case "TM":
                case "TV":
                case "WF":
                    i2 = 75924;
                    break;
                case "MK":
                    i2 = 78337;
                    break;
                case "MN":
                    i2 = 74882;
                    break;
                case "MO":
                    i2 = 47376;
                    break;
                case "MQ":
                    i2 = 75402;
                    break;
                case "MU":
                    i2 = 74763;
                    break;
                case "MV":
                    i2 = 83539;
                    break;
                case "MW":
                    i2 = 74387;
                    break;
                case "MX":
                    i2 = 80162;
                    break;
                case "MY":
                    i2 = 4865;
                    break;
                case "MZ":
                case "WS":
                    i2 = 74891;
                    break;
                case "NA":
                    i2 = 74979;
                    break;
                case "NC":
                case "YT":
                    i2 = 75994;
                    break;
                case "NG":
                    i2 = 74403;
                    break;
                case "NL":
                    i2 = 132874;
                    break;
                case "NO":
                    i2 = 65728;
                    break;
                case "NP":
                    i2 = 75538;
                    break;
                case "NZ":
                    i2 = 83008;
                    break;
                case "OM":
                    i2 = 83034;
                    break;
                case "PE":
                    i2 = 80145;
                    break;
                case "PF":
                    i2 = 74450;
                    break;
                case "PH":
                    i2 = 42634;
                    break;
                case "PK":
                    i2 = 75483;
                    break;
                case "PL":
                    i2 = 148609;
                    break;
                case "PR":
                    i2 = 8834;
                    break;
                case "PS":
                    i2 = 75363;
                    break;
                case "PW":
                    i2 = 74514;
                    break;
                case "QA":
                    i2 = 84257;
                    break;
                case "RE":
                    i2 = 71320;
                    break;
                case "RO":
                    i2 = 78400;
                    break;
                case "RS":
                    i2 = 74241;
                    break;
                case "RU":
                    i2 = 111105;
                    break;
                case "RW":
                    i2 = 73883;
                    break;
                case "SA":
                    i2 = 9291;
                    break;
                case "SB":
                case "ZW":
                    i2 = 75540;
                    break;
                case "SG":
                    i2 = 38618;
                    break;
                case "SK":
                    i2 = 74312;
                    break;
                case "SN":
                    i2 = 74980;
                    break;
                case "SO":
                    i2 = 84178;
                    break;
                case "SR":
                    i2 = 74530;
                    break;
                case "ST":
                    i2 = 74834;
                    break;
                case "SV":
                    i2 = 74394;
                    break;
                case "TC":
                    i2 = 74835;
                    break;
                case "TG":
                    i2 = 73827;
                    break;
                case "TN":
                    i2 = 74315;
                    break;
                case "TO":
                    i2 = 75539;
                    break;
                case "TT":
                    i2 = 73826;
                    break;
                case "TW":
                    break;
                case "TZ":
                    i2 = 78499;
                    break;
                case "UG":
                    i2 = 83611;
                    break;
                case "US":
                    i2 = 45842;
                    break;
                case "UY":
                    i2 = 70730;
                    break;
                case "UZ":
                    i2 = 80081;
                    break;
                case "VG":
                    i2 = 139858;
                    break;
                case "VI":
                    i2 = 74832;
                    break;
                case "VN":
                    i2 = 74816;
                    break;
                case "XK":
                    i2 = 74321;
                    break;
                case "ZA":
                    i2 = 70306;
                    break;
                case "ZM":
                    i2 = 75556;
                    break;
                default:
                    i2 = 74898;
                    break;
            }
            if (i == 2) {
                jLongValue = ((Long) P0.get(i2 & 7)).longValue();
            } else if (i == 3) {
                jLongValue = ((Long) Q0.get((i2 >> 3) & 7)).longValue();
            } else if (i == 4) {
                jLongValue = ((Long) R0.get((i2 >> 6) & 7)).longValue();
            } else if (i == 5) {
                jLongValue = ((Long) S0.get((i2 >> 9) & 7)).longValue();
            } else if (i == 7) {
                jLongValue = ((Long) P0.get(i2 & 7)).longValue();
            } else if (i == 9) {
                jLongValue = ((Long) U0.get((i2 >> 15) & 7)).longValue();
            } else if (i != 10) {
                jLongValue = 1000000;
            } else {
                jLongValue = ((Long) T0.get((i2 >> 12) & 7)).longValue();
            }
            lValueOf = Long.valueOf(jLongValue);
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    public final void h(int i, long j, long j2) {
        int i2;
        long j3;
        long j4;
        if (i == 0 && j == 0 && j2 == this.Z) {
            return;
        }
        this.Z = j2;
        for (m4a m4aVar : (CopyOnWriteArrayList) this.c.b) {
            if (m4aVar.c) {
                i2 = i;
                j3 = j;
                j4 = j2;
            } else {
                i2 = i;
                j3 = j;
                j4 = j2;
                m4aVar.a.post(new o38((byte) 1, i2, j3, j4, m4aVar));
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    /* JADX WARN: Code duplicated, block: B:13:0x0013 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:15:0x0015 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0006, B:15:0x0015, B:17:0x0019, B:18:0x0024), top: B:23:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0019 A[Catch: all -> 0x000e, TryCatch #0 {, blocks: (B:6:0x0006, B:15:0x0015, B:17:0x0019, B:18:0x0024), top: B:23:0x0006 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0013, please report this as an issue */
    public final synchronized void j(o2r o2rVar, n3r n3rVar, boolean z) {
        boolean z2;
        if (!z) {
            z2 = false;
            if (z2) {
                if (this.g == 0) {
                    this.d.getClass();
                    this.h = SystemClock.elapsedRealtime();
                }
                this.g++;
                return;
            }
            return;
        }
        if (n3rVar.c(8)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return;
        }
        if (this.g == 0) {
            this.d.getClass();
            this.h = SystemClock.elapsedRealtime();
        }
        this.g++;
        return;
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:14:0x0014 A[Catch: all -> 0x000d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:14:0x0014), top: B:19:0x0005 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x0012, please report this as an issue */
    public final synchronized void m(o2r o2rVar, n3r n3rVar, boolean z, int i) {
        boolean z2;
        if (!z) {
            z2 = false;
            if (z2) {
                this.i += (long) i;
                return;
            }
            return;
        }
        if (n3rVar.c(8)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return;
        }
        this.i += (long) i;
        return;
        throw th;
    }

    public final yeg1 d() {
        return this;
    }

    public final void t(o2r o2rVar, n3r n3rVar, boolean z) {
    }
}
