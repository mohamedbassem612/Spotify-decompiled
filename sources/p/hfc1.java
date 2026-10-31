package p;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class hfc1 {
    public static final sy8 a = new sy8("camera2.streamSpec.streamUseCase", Long.TYPE, null);
    public static final HashMap b;
    public static final HashMap c;

    static {
        HashMap map = new HashMap();
        b = map;
        HashMap map2 = new HashMap();
        c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            k4i1 k4i1Var = k4i1.b;
            hashSet.add(k4i1Var);
            k4i1 k4i1Var2 = k4i1.f;
            hashSet.add(k4i1Var2);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(k4i1Var);
            hashSet2.add(k4i1Var2);
            hashSet2.add(k4i1.c);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            k4i1 k4i1Var3 = k4i1.a;
            hashSet3.add(k4i1Var3);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            k4i1 k4i1Var4 = k4i1.d;
            hashSet4.add(k4i1Var4);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(k4i1Var);
            hashSet5.add(k4i1Var3);
            hashSet5.add(k4i1Var4);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(k4i1Var);
            hashSet6.add(k4i1Var4);
            map2.put(3L, hashSet6);
        }
    }

    public static boolean a(w2d w2dVar, List list) {
        long[] jArr;
        if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) w2dVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j : jArr) {
                hashSet.add(Long.valueOf(j));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!hashSet.contains(Long.valueOf(((k29) it.next()).c))) {
                }
            }
            return true;
        }
        return false;
    }

    public static z1d b(qsk qskVar, long j) {
        sy8 sy8Var = a;
        if (qskVar.g(sy8Var) && ((Long) qskVar.e(sy8Var)).longValue() == j) {
            return null;
        }
        xdn0 xdn0VarN = xdn0.n(qskVar);
        xdn0VarN.r(sy8Var, Long.valueOf(j));
        return new z1d(xdn0VarN, (byte) 9);
    }

    public static boolean c(k4i1 k4i1Var, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (k4i1Var != k4i1.e) {
            Long lValueOf = Long.valueOf(j);
            HashMap map = b;
            return map.containsKey(lValueOf) && ((Set) map.get(Long.valueOf(j))).contains(k4i1Var);
        }
        Long lValueOf2 = Long.valueOf(j);
        HashMap map2 = c;
        if (!map2.containsKey(lValueOf2)) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((k4i1) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(w2d w2dVar) {
        long[] jArr;
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) w2dVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    public static boolean e(qsk qskVar, k4i1 k4i1Var) {
        if (((Boolean) qskVar.h(i4i1.G0, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        sy8 sy8Var = qr70.b;
        if (qskVar.g(sy8Var)) {
            return k4i1Var.ordinal() == 0 && ((Integer) qskVar.e(sy8Var)).intValue() == 2;
        }
        return false;
    }

    public static boolean f(w2d w2dVar, ArrayList arrayList, HashMap map, HashMap map2) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList<i4i1> arrayList2 = new ArrayList(map.keySet());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ey8) it.next()).f.getClass();
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                i29 i29Var = (i29) map.get((i4i1) it2.next());
                i29Var.getClass();
                i29Var.d.getClass();
            }
            long[] jArr = (long[]) w2dVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    ey8 ey8Var = (ey8) it3.next();
                    qsk qskVar = ey8Var.f;
                    sy8 sy8Var = z1d.d;
                    if (qskVar.g(sy8Var) && ((Long) ey8Var.f.e(sy8Var)).longValue() != 0) {
                        z2 = false;
                        z = true;
                    } else {
                        z = false;
                        z2 = true;
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                for (i4i1 i4i1Var : arrayList2) {
                    sy8 sy8Var2 = z1d.d;
                    if (i4i1Var.g(sy8Var2)) {
                        Long l = (Long) i4i1Var.e(sy8Var2);
                        if (l.longValue() != 0) {
                            if (z2) {
                                hhg1.n("Either all use cases must have non-default stream use case assigned or none should have it");
                                return false;
                            }
                            hashSet2.add(l);
                            z = true;
                        } else if (z) {
                            hhg1.n("Either all use cases must have non-default stream use case assigned or none should have it");
                            return false;
                        }
                    } else if (z) {
                        hhg1.n("Either all use cases must have non-default stream use case assigned or none should have it");
                        return false;
                    }
                    z2 = true;
                }
                if (!z2) {
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        if (!hashSet.contains((Long) it4.next())) {
                        }
                    }
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        ey8 ey8Var2 = (ey8) it5.next();
                        qsk qskVar2 = ey8Var2.f;
                        z1d z1dVarB = b(qskVar2, ((Long) qskVar2.e(z1d.d)).longValue());
                        if (z1dVarB != null) {
                            Size size = ey8Var2.c;
                            Range range = i29.f;
                            if (size == null) {
                                bhn0.i("Null resolution");
                                return false;
                            }
                            Range range2 = i29.f;
                            if (range2 == null) {
                                bhn0.i("Null expectedFrameRateRange");
                                return false;
                            }
                            liv livVar = ey8Var2.d;
                            if (livVar == null) {
                                bhn0.i("Null dynamicRange");
                                return false;
                            }
                            Range range3 = ey8Var2.g;
                            map2.put(ey8Var2, new i29(size, livVar, range3 != null ? range3 : range2, z1dVarB, false));
                        }
                    }
                    for (i4i1 i4i1Var2 : arrayList2) {
                        i29 i29Var2 = (i29) map.get(i4i1Var2);
                        qsk qskVar3 = i29Var2.d;
                        z1d z1dVarB2 = b(qskVar3, ((Long) qskVar3.e(z1d.d)).longValue());
                        if (z1dVarB2 != null) {
                            zwg zwgVarA = i29Var2.a();
                            zwgVarA.d = z1dVarB2;
                            map.put(i4i1Var2, zwgVarA.i());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
