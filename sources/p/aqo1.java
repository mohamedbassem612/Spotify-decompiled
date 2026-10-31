package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.recaptcha.internal.zzakh;
import com.spotify.messages.OopsMetricEvent;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class aqo1 {
    public static b180 a;

    public static Object A(Object obj, int i, win1 win1Var, fnn1 fnn1Var, Object obj2) {
        if (fnn1Var == null) {
            return obj2;
        }
        if (win1Var == null) {
            Iterator it = win1Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!fnn1.a(iIntValue)) {
                    obj2 = B(obj, i, iIntValue, obj2);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = win1Var.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) win1Var.get(i3);
            int iIntValue2 = num.intValue();
            if (fnn1.a(iIntValue2)) {
                if (i3 != i2) {
                    win1Var.set(i2, num);
                }
                i2++;
            } else {
                obj2 = B(obj, i, iIntValue2, obj2);
            }
        }
        if (i2 != size) {
            win1Var.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object B(Object obj, int i, int i2, Object obj2) {
        if (obj2 == null) {
            obj2 = njx0.e(obj);
        }
        ((bkn1) obj2).d(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static final kbn1 C() {
        return new kbn1(1, null, null, null, null, null, false, false, false, false);
    }

    public static void D(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        if (list instanceof ein1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w4c0Var.g0(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        w4c0Var.k0(i3);
        while (i2 < list.size()) {
            w4c0Var.n0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void E(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        if (list instanceof jin1) {
            bhn0.d();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                w4c0Var.e0(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        w4c0Var.k0(i3);
        while (i2 < list.size()) {
            w4c0Var.l0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void F(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = 0;
        if (!(list instanceof bjn1)) {
            if (!z) {
                while (i2 < list.size()) {
                    w4c0Var.f0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            w4c0Var.b0(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i3)).longValue()) * 9)) >>> 6;
            }
            w4c0Var.k0(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                w4c0Var.m0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bjn1 bjn1Var = (bjn1) list;
        if (!z) {
            while (i2 < bjn1Var.c) {
                w4c0Var.f0(i, bjn1Var.c(i2));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < bjn1Var.c; i4++) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(bjn1Var.c(i4)) * 9)) >>> 6;
        }
        w4c0Var.k0(iNumberOfLeadingZeros2);
        while (i2 < bjn1Var.c) {
            w4c0Var.m0(bjn1Var.c(i2));
            i2++;
        }
    }

    public static void G(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = 0;
        if (!(list instanceof bjn1)) {
            if (!z) {
                while (i2 < list.size()) {
                    w4c0Var.f0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            w4c0Var.b0(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i3)).longValue()) * 9)) >>> 6;
            }
            w4c0Var.k0(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                w4c0Var.m0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bjn1 bjn1Var = (bjn1) list;
        if (!z) {
            while (i2 < bjn1Var.c) {
                w4c0Var.f0(i, bjn1Var.c(i2));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < bjn1Var.c; i4++) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(bjn1Var.c(i4)) * 9)) >>> 6;
        }
        w4c0Var.k0(iNumberOfLeadingZeros2);
        while (i2 < bjn1Var.c) {
            w4c0Var.m0(bjn1Var.c(i2));
            i2++;
        }
    }

    public static void H(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = 0;
        if (!(list instanceof bjn1)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    w4c0Var.f0(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            w4c0Var.b0(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2)) * 9)) >>> 6;
            }
            w4c0Var.k0(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                w4c0Var.m0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        bjn1 bjn1Var = (bjn1) list;
        if (!z) {
            while (i2 < bjn1Var.c) {
                long jC = bjn1Var.c(i2);
                w4c0Var.f0(i, (jC >> 63) ^ (jC + jC));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < bjn1Var.c; i4++) {
            long jC2 = bjn1Var.c(i4);
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros((jC2 >> 63) ^ (jC2 + jC2)) * 9)) >>> 6;
        }
        w4c0Var.k0(iNumberOfLeadingZeros2);
        while (i2 < bjn1Var.c) {
            long jC3 = bjn1Var.c(i2);
            w4c0Var.m0((jC3 >> 63) ^ (jC3 + jC3));
            i2++;
        }
    }

    public static void I(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = 0;
        if (!(list instanceof bjn1)) {
            if (!z) {
                while (i2 < list.size()) {
                    w4c0Var.g0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            w4c0Var.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            w4c0Var.k0(i3);
            while (i2 < list.size()) {
                w4c0Var.n0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bjn1 bjn1Var = (bjn1) list;
        if (!z) {
            while (i2 < bjn1Var.c) {
                w4c0Var.g0(i, bjn1Var.c(i2));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < bjn1Var.c; i6++) {
            bjn1Var.c(i6);
            i5 += 8;
        }
        w4c0Var.k0(i5);
        while (i2 < bjn1Var.c) {
            w4c0Var.n0(bjn1Var.c(i2));
            i2++;
        }
    }

    public static void J(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = 0;
        if (!(list instanceof bjn1)) {
            if (!z) {
                while (i2 < list.size()) {
                    w4c0Var.g0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            w4c0Var.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            w4c0Var.k0(i3);
            while (i2 < list.size()) {
                w4c0Var.n0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bjn1 bjn1Var = (bjn1) list;
        if (!z) {
            while (i2 < bjn1Var.c) {
                w4c0Var.g0(i, bjn1Var.c(i2));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < bjn1Var.c; i6++) {
            bjn1Var.c(i6);
            i5 += 8;
        }
        w4c0Var.k0(i5);
        while (i2 < bjn1Var.c) {
            w4c0Var.n0(bjn1Var.c(i2));
            i2++;
        }
    }

    public static void K(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = 0;
        if (!(list instanceof sin1)) {
            if (!z) {
                while (i2 < list.size()) {
                    w4c0Var.c0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            w4c0Var.b0(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            w4c0Var.k0(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                w4c0Var.j0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        sin1 sin1Var = (sin1) list;
        if (!z) {
            while (i2 < sin1Var.c) {
                w4c0Var.c0(i, sin1Var.d(i2));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < sin1Var.c; i4++) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(sin1Var.d(i4)) * 9)) >>> 6;
        }
        w4c0Var.k0(iNumberOfLeadingZeros2);
        while (i2 < sin1Var.c) {
            w4c0Var.j0(sin1Var.d(i2));
            i2++;
        }
    }

    public static void L(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = 0;
        if (!(list instanceof sin1)) {
            if (!z) {
                while (i2 < list.size()) {
                    w4c0Var.d0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            w4c0Var.b0(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            w4c0Var.k0(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                w4c0Var.k0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        sin1 sin1Var = (sin1) list;
        if (!z) {
            while (i2 < sin1Var.c) {
                w4c0Var.d0(i, sin1Var.d(i2));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < sin1Var.c; i4++) {
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros(sin1Var.d(i4)) * 9)) >>> 6;
        }
        w4c0Var.k0(iNumberOfLeadingZeros2);
        while (i2 < sin1Var.c) {
            w4c0Var.k0(sin1Var.d(i2));
            i2++;
        }
    }

    public static void M(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = 0;
        if (!(list instanceof sin1)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    w4c0Var.d0(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            w4c0Var.b0(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iB += gvg.b((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2), 9, 352) >>> 6;
            }
            w4c0Var.k0(iB);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                w4c0Var.k0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        sin1 sin1Var = (sin1) list;
        if (!z) {
            while (i2 < sin1Var.c) {
                int iD = sin1Var.d(i2);
                w4c0Var.d0(i, (iD >> 31) ^ (iD + iD));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < sin1Var.c; i4++) {
            int iD2 = sin1Var.d(i4);
            iB2 += gvg.b((iD2 >> 31) ^ (iD2 + iD2), 9, 352) >>> 6;
        }
        w4c0Var.k0(iB2);
        while (i2 < sin1Var.c) {
            int iD3 = sin1Var.d(i2);
            w4c0Var.k0((iD3 >> 31) ^ (iD3 + iD3));
            i2++;
        }
    }

    public static void N(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = 0;
        if (!(list instanceof sin1)) {
            if (!z) {
                while (i2 < list.size()) {
                    w4c0Var.e0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            w4c0Var.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            w4c0Var.k0(i3);
            while (i2 < list.size()) {
                w4c0Var.l0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        sin1 sin1Var = (sin1) list;
        if (!z) {
            while (i2 < sin1Var.c) {
                w4c0Var.e0(i, sin1Var.d(i2));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < sin1Var.c; i6++) {
            sin1Var.d(i6);
            i5 += 4;
        }
        w4c0Var.k0(i5);
        while (i2 < sin1Var.c) {
            w4c0Var.l0(sin1Var.d(i2));
            i2++;
        }
    }

    public static void O(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = 0;
        if (!(list instanceof sin1)) {
            if (!z) {
                while (i2 < list.size()) {
                    w4c0Var.e0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            w4c0Var.b0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            w4c0Var.k0(i3);
            while (i2 < list.size()) {
                w4c0Var.l0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        sin1 sin1Var = (sin1) list;
        if (!z) {
            while (i2 < sin1Var.c) {
                w4c0Var.e0(i, sin1Var.d(i2));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < sin1Var.c; i6++) {
            sin1Var.d(i6);
            i5 += 4;
        }
        w4c0Var.k0(i5);
        while (i2 < sin1Var.c) {
            w4c0Var.l0(sin1Var.d(i2));
            i2++;
        }
    }

    public static void P(int i, List list, ltf1 ltf1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = 0;
        if (!(list instanceof sin1)) {
            if (!z) {
                while (i2 < list.size()) {
                    w4c0Var.c0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            w4c0Var.b0(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            w4c0Var.k0(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                w4c0Var.j0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        sin1 sin1Var = (sin1) list;
        if (!z) {
            while (i2 < sin1Var.c) {
                w4c0Var.c0(i, sin1Var.d(i2));
                i2++;
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < sin1Var.c; i4++) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(sin1Var.d(i4)) * 9)) >>> 6;
        }
        w4c0Var.k0(iNumberOfLeadingZeros2);
        while (i2 < sin1Var.c) {
            w4c0Var.j0(sin1Var.d(i2));
            i2++;
        }
    }

    public static void Q(int i, List list, ltf1 ltf1Var, boolean z) throws zzakh {
        if (list == null || list.isEmpty()) {
            return;
        }
        w4c0 w4c0Var = (w4c0) ltf1Var.b;
        int i2 = w4c0Var.b;
        byte[] bArr = (byte[]) w4c0Var.e;
        if (list instanceof rhn1) {
            bhn0.d();
            return;
        }
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i3)).booleanValue();
                w4c0Var.k0(i << 3);
                int i4 = w4c0Var.c;
                int i5 = i4 + 1;
                try {
                    bArr[i4] = bBooleanValue;
                    w4c0Var.c = i5;
                    i3++;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzakh(i5, i2, 1, e);
                }
            }
            return;
        }
        w4c0Var.b0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        w4c0Var.k0(i6);
        while (i3 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i3)).booleanValue();
            int i8 = w4c0Var.c;
            int i9 = i8 + 1;
            try {
                bArr[i8] = bBooleanValue2;
                w4c0Var.c = i9;
                i3++;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzakh(i9, i2, 1, e2);
            }
        }
    }

    public static int R(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof bjn1)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i)).longValue()) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        bjn1 bjn1Var = (bjn1) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(bjn1Var.c(i)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    public static int S(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof bjn1)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i)).longValue()) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        bjn1 bjn1Var = (bjn1) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(bjn1Var.c(i)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    public static int T(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof bjn1)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue >> 63) ^ (jLongValue + jLongValue)) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        bjn1 bjn1Var = (bjn1) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            long jC = bjn1Var.c(i);
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros((jC >> 63) ^ (jC + jC)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    public static int U(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof sin1)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Integer) list.get(i)).intValue()) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        sin1 sin1Var = (sin1) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(sin1Var.d(i)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    public static int V(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof sin1)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Integer) list.get(i)).intValue()) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        sin1 sin1Var = (sin1) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(sin1Var.d(i)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    public static int W(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof sin1)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i)).intValue()) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        sin1 sin1Var = (sin1) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros(sin1Var.d(i)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    public static int X(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof sin1)) {
            int iB = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iB += gvg.b((iIntValue >> 31) ^ (iIntValue + iIntValue), 9, 352) >>> 6;
                i++;
            }
            return iB;
        }
        sin1 sin1Var = (sin1) list;
        int iB2 = 0;
        while (i < size) {
            int iD = sin1Var.d(i);
            iB2 += gvg.b((iD >> 31) ^ (iD + iD), 9, 352) >>> 6;
            i++;
        }
        return iB2;
    }

    public static int Y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return ((gvg.b(i << 3, 9, 352) >>> 6) + 4) * size;
    }

    public static int Z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return ((gvg.b(i << 3, 9, 352) >>> 6) + 8) * size;
    }

    public static final void a(int i, String str, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1505307726);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(function1) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            h7p1.a(new pk1(z ? qk1.b : qk1.a, false, str, (String) null, (j7p1) null, 26), new gbx(z50.c, z ? function1 : function0), qim0Var, null, null, x340Var, (i2 >> 6) & 896, 24);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb7(function0, function1, str, z, qim0Var, i);
        }
    }

    public static int a0(int i, nhn1 nhn1Var, qjn1 qjn1Var) {
        int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        return iNumberOfLeadingZeros + iNumberOfLeadingZeros + nhn1Var.e(qjn1Var);
    }

    public static final void b(Uri uri, boolean z, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-420803316);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(uri) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var3, 112.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarR, er31.b(8.0f));
            long jA = cbx.a(x340Var).a.b.a();
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarN = anm1.N("artwork_slot", dug.f(qim0VarQ, jA, u5j1Var));
            boolean z3 = (i3 & 896) == 256;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new j3n(function0, (byte) 5);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarN, z, null, null, null, (Function0) objT, 14);
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            Uri uri2 = uri == null ? Uri.EMPTY : uri;
            uri2.getClass();
            p3v p3vVar = new p3v(112.0f);
            mrx mrxVar = mrx.c;
            nux nuxVar = new nux(mrxVar, mrxVar);
            isl islVar = isl.a;
            eso1.e(uri2, islVar, (qim0) null, p3vVar, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, 1073741872, 0, 3572);
            x340Var = x340Var;
            if (z) {
                x340Var.i0(547378858);
                qim0 qim0VarA = h2c.a.a(qim0Var3, een.Y);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarF = dug.f(u291.r(i1p1.q(uyn1.x(qim0VarA, 8.0f), er31.a), 32.0f), u7h.b(u7h.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), u5j1Var);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                w0h1.a(xmx.c, islVar, u291.r(qim0Var3, 16.0f), u7h.f, 0L, false, x340Var, xmx.d | 48, 48);
                x340Var = x340Var;
                z2 = true;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                z2 = true;
                x340Var.i0(547876656);
                x340Var.r(false);
            }
            x340Var.r(z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(uri, z, function0, qim0Var2, i, (byte) 14);
        }
    }

    public static boolean b0(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(boolean z, int i, j2i j2iVar, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2114277836);
        int i3 = (x340Var.h(z) ? 4 : 2) | i2 | (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (z) {
                x340Var.i0(992957655);
                xap1.f(0, 1, x340Var, null);
                x340Var.r(false);
            } else {
                x340Var.i0(992983602);
                x340Var.r(false);
            }
            if (i == 0) {
                x340Var.i0(993009486);
            } else {
                x340Var.i0(993009487);
                kqn1.d(i, 0, 2, x340Var, null);
            }
            x340Var.r(false);
            j2iVar.invoke(pw31.a, x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new db7(z, i, j2iVar, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:117:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:129:0x020f  */
    /* JADX WARN: Code duplicated, block: B:130:0x021a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0226  */
    /* JADX WARN: Code duplicated, block: B:133:0x0268  */
    /* JADX WARN: Code duplicated, block: B:137:0x0282  */
    /* JADX WARN: Code duplicated, block: B:140:0x0297  */
    /* JADX WARN: Code duplicated, block: B:141:0x0299  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:149:0x02af  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:156:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:170:0x0326  */
    /* JADX WARN: Code duplicated, block: B:171:0x0333  */
    /* JADX WARN: Code duplicated, block: B:173:0x034d  */
    /* JADX WARN: Code duplicated, block: B:174:0x035b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0376 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x0378  */
    /* JADX WARN: Code duplicated, block: B:179:0x0382  */
    /* JADX WARN: Code duplicated, block: B:181:0x0388  */
    /* JADX WARN: Code duplicated, block: B:183:0x0396  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(Function0 function0, Function0 function1, Function0 function2, String str, hux huxVar, String str2, boolean z, boolean z2, boolean z3, qim0 qim0Var, int i, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, boolean z4, boolean z5, sfu0 sfu0Var, boolean z6, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        Function0 function3;
        String str3;
        boolean z7;
        boolean z8;
        x340 x340Var;
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z9;
        String strK;
        int i3;
        int i4;
        boolean z10;
        int i5;
        int i6;
        String strK2;
        String strK3;
        q8h0 q8h0Var;
        qim0 qim0VarF;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objT;
        String str4;
        boolean z18;
        boolean z19;
        xu30 xu30Var;
        xu30 xu30Var2;
        gbx gbxVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2127422522);
        int i7 = i2 | (x340Var2.i(function0) ? 4 : 2) | (x340Var2.i(function1) ? 32 : 16) | (x340Var2.i(function2) ? 256 : 128) | (x340Var2.g(str) ? 2048 : 1024) | (x340Var2.i(huxVar) ? 16384 : 8192) | (x340Var2.g(str2) ? 131072 : 65536) | (x340Var2.h(z) ? 1048576 : 524288) | (x340Var2.h(z2) ? 8388608 : 4194304) | (x340Var2.h(z3) ? 67108864 : 33554432) | 805306368;
        boolean z20 = (((((((x340Var2.e(i) ? (char) 4 : (char) 2) | (x340Var2.i(vu30Var) ? ' ' : (char) 16) ? 1 : 0) | (x340Var2.i(vu30Var2) ? (char) 256 : (char) 128) ? 1 : 0) | (x340Var2.i(vu30Var3) ? (char) 2048 : (char) 1024) ? 1 : 0) | (x340Var2.h(z4) ? (char) 16384 : (char) 8192) ? 1 : 0) | (x340Var2.h(z5) ? (char) 0 : (char) 0) ? 1 : 0) | (x340Var2.i(sfu0Var) ? (char) 0 : (char) 0) ? 1 : 0) | (x340Var2.h(z6) ? (char) 0 : (char) 0);
        if (x340Var2.Y(i7 & 1, ((i7 & 306783379) == 306783378 && ((z20 ? 1 : 0) & 9363) == 4793490) ? false : true)) {
            x340Var2.d0();
            if ((i2 & 1) == 0 || x340Var2.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var2.b0();
                qim0Var3 = qim0Var;
            }
            x340Var2.s();
            boolean z21 = ((i7 & 7168) == 2048) | (((z20 ? 1 : 0) & 57344) == 16384);
            Object objT2 = x340Var2.T();
            gbx gbxVar2 = null;
            if (z21 || objT2 == m4cVar) {
                String str5 = (z4 || ihc1.y0(str)) ? null : str;
                objT2 = str5 != null ? Uri.parse(str5) : Uri.EMPTY;
                x340Var2.s0(objT2);
            }
            Uri uri = (Uri) objT2;
            uvx uvxVar = (uvx) x340Var2.k(vvx.a);
            zzq0 zzq0VarP = gto1.p(uvxVar.a, x340Var2, uvxVar.c);
            tzq0 tzq0Var = new tzq0(uyn1.n(zzq0VarP, (flb0) x340Var2.k(t4k.n)), zzq0VarP.c, 0.0f, zzq0VarP.e);
            if (z && z6) {
                i3 = 48664172;
                i4 = 2131952500;
                z9 = false;
            } else {
                z9 = false;
                if (z6) {
                    i3 = 48667558;
                    i4 = 2131952501;
                } else {
                    if (z) {
                        i3 = 48670563;
                        i4 = 2131952499;
                    } else {
                        x340Var2.i0(1508872611);
                        x340Var2.r(false);
                        strK = null;
                    }
                    if (!(sfu0Var instanceof rfu0) || (sfu0Var instanceof kfu0)) {
                        z10 = false;
                        i5 = 48677990;
                        i6 = 2131952543;
                    } else {
                        if (!(sfu0Var instanceof lfu0) && !sfu0Var.equals(ofu0.a)) {
                            throw p3d1.k(x340Var2, 48674979, false);
                        }
                        z10 = false;
                        i5 = 48682630;
                        i6 = 2131952502;
                    }
                    strK2 = x0d.k(x340Var2, i5, i6, x340Var2, z10);
                    if (z) {
                        strK3 = x0d.k(x340Var2, 48687104, 2131952504, x340Var2, z10);
                    } else {
                        strK3 = x0d.k(x340Var2, 48689821, 2131952478, x340Var2, z10);
                    }
                    if (z6) {
                        x340Var2.i0(48693519);
                        uwr uwrVar = cbx.a;
                        long jB = cbx.a(x340Var2).a.a.b();
                        long j = cbx.a(x340Var2).d.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        cua cuaVar = cbx.b(x340Var2).f;
                        avw0 avw0Var = cbx.b(x340Var2).c;
                        q8h0Var = new q8h0(jB, j);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1509525347);
                        x340Var2.r(false);
                        q8h0Var = null;
                    }
                    qim0VarF = u291.f(qim0Var3, 1.0f);
                    if (q8h0Var != null) {
                        qim0VarF = exd0.q(qim0VarF, new z6h0(q8h0Var, (byte) 2));
                    }
                    qim0 qim0Var4 = qim0VarF;
                    boolean zG = x340Var2.g(strK);
                    if ((i7 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z22 = zG | z11;
                    if ((234881024 & i7) == 67108864) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z23 = z22 | z12;
                    if ((29360128 & i7) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean zG2 = z23 | z13 | x340Var2.g(strK2) | x340Var2.g(strK3);
                    if ((3670016 & i7) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z24 = zG2 | z14;
                    if ((i7 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z25 = z24 | z15;
                    if ((i7 & 14) == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z25 | z16;
                    objT = x340Var2.T();
                    if (!z17 || objT == m4cVar) {
                        x340Var = x340Var2;
                        str4 = strK2;
                        eo1 eo1Var = new eo1(strK, function2, z3, z2, str4, strK3, z, function1, function0);
                        function3 = function2;
                        z18 = z2;
                        x340Var.s0(eo1Var);
                        objT = eo1Var;
                    } else {
                        function3 = function2;
                        z18 = z2;
                        x340Var = x340Var2;
                        str4 = strK2;
                    }
                    qim0 qim0VarB = s161.b(qim0Var4, true, (iu30) objT);
                    uvx uvxVarA = uvx.a(uvxVar, (pgx) null, 0, tzq0Var, (vzq0) null, (tvx) null, (p3v) null, 503);
                    if (vu30Var == null) {
                        x340Var.i0(1511061831);
                        z19 = false;
                        x340Var.r(false);
                        xu30Var = null;
                    } else {
                        z19 = false;
                        x340Var.i0(1511061832);
                        xu30 xu30VarR = apo.r(-781611731, new fb7(z18, z5, vu30Var, 0 == true ? 1 : 0), x340Var);
                        x340Var.r(false);
                        xu30Var = xu30VarR;
                    }
                    if (vu30Var3 == null) {
                        x340Var.i0(1511549523);
                        x340Var.r(z19);
                        xu30Var2 = null;
                    } else {
                        x340Var.i0(1511549524);
                        xu30 xu30VarR2 = apo.r(-1083852650, new gb7(zzq0VarP, z18, z5, vu30Var3), x340Var);
                        x340Var.r(z19);
                        xu30Var2 = xu30VarR2;
                    }
                    if (function3 != null) {
                        if (z5) {
                            gbxVar = new gbx(z50.c, function3);
                        } else {
                            if (!ihc1.y0(str4)) {
                                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                return;
                            }
                            gbxVar = new gbx(new y50(str4), function3);
                        }
                        gbxVar2 = gbxVar;
                    }
                    gbx gbxVar3 = gbxVar2;
                    j2i j2iVarR = apo.r(1799142499, new hb7(uri, huxVar, z18, z3, sfu0Var, z5), x340Var);
                    str3 = str2;
                    z8 = z5;
                    z7 = z2;
                    jto1.b(qim0VarB, uvxVarA, null, false, null, null, gbxVar3, null, null, j2iVarR, null, xu30Var, apo.r(-343751647, new ib7(function0, function1, str3, z, z2, z8, vu30Var2), x340Var), xu30Var2, null, apo.r(-1664369538, new jb7(str3, i, z7, z8), x340Var), x340Var, 805306432, 196992, 17852);
                    qim0Var2 = qim0Var3;
                }
            }
            strK = x0d.k(x340Var2, i3, i4, x340Var2, z9);
            if (sfu0Var instanceof rfu0) {
                z10 = false;
                i5 = 48677990;
                i6 = 2131952543;
            } else {
                z10 = false;
                i5 = 48677990;
                i6 = 2131952543;
            }
            strK2 = x0d.k(x340Var2, i5, i6, x340Var2, z10);
            if (z) {
                strK3 = x0d.k(x340Var2, 48687104, 2131952504, x340Var2, z10);
            } else {
                strK3 = x0d.k(x340Var2, 48689821, 2131952478, x340Var2, z10);
            }
            if (z6) {
                x340Var2.i0(48693519);
                uwr uwrVar2 = cbx.a;
                long jB2 = cbx.a(x340Var2).a.a.b();
                long j2 = cbx.a(x340Var2).d.a;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                cvx cvxVar4 = cbx.b(x340Var2).b;
                cua cuaVar2 = cbx.b(x340Var2).f;
                avw0 avw0Var2 = cbx.b(x340Var2).c;
                q8h0Var = new q8h0(jB2, j2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1509525347);
                x340Var2.r(false);
                q8h0Var = null;
            }
            qim0VarF = u291.f(qim0Var3, 1.0f);
            if (q8h0Var != null) {
                qim0VarF = exd0.q(qim0VarF, new z6h0(q8h0Var, (byte) 2));
            }
            qim0 qim0Var5 = qim0VarF;
            boolean zG3 = x340Var2.g(strK);
            if ((i7 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z26 = zG3 | z11;
            if ((234881024 & i7) == 67108864) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z27 = z26 | z12;
            if ((29360128 & i7) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zG4 = z27 | z13 | x340Var2.g(strK2) | x340Var2.g(strK3);
            if ((3670016 & i7) == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z28 = zG4 | z14;
            if ((i7 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z29 = z28 | z15;
            if ((i7 & 14) == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z29 | z16;
            objT = x340Var2.T();
            if (z17) {
                x340Var = x340Var2;
                str4 = strK2;
                eo1 eo1Var2 = new eo1(strK, function2, z3, z2, str4, strK3, z, function1, function0);
                function3 = function2;
                z18 = z2;
                x340Var.s0(eo1Var2);
                objT = eo1Var2;
            } else {
                x340Var = x340Var2;
                str4 = strK2;
                eo1 eo1Var3 = new eo1(strK, function2, z3, z2, str4, strK3, z, function1, function0);
                function3 = function2;
                z18 = z2;
                x340Var.s0(eo1Var3);
                objT = eo1Var3;
            }
            qim0 qim0VarB2 = s161.b(qim0Var5, true, (iu30) objT);
            uvx uvxVarA2 = uvx.a(uvxVar, (pgx) null, 0, tzq0Var, (vzq0) null, (tvx) null, (p3v) null, 503);
            if (vu30Var == null) {
                x340Var.i0(1511061831);
                z19 = false;
                x340Var.r(false);
                xu30Var = null;
            } else {
                z19 = false;
                x340Var.i0(1511061832);
                xu30 xu30VarR3 = apo.r(-781611731, new fb7(z18, z5, vu30Var, 0 == true ? 1 : 0), x340Var);
                x340Var.r(false);
                xu30Var = xu30VarR3;
            }
            if (vu30Var3 == null) {
                x340Var.i0(1511549523);
                x340Var.r(z19);
                xu30Var2 = null;
            } else {
                x340Var.i0(1511549524);
                xu30 xu30VarR4 = apo.r(-1083852650, new gb7(zzq0VarP, z18, z5, vu30Var3), x340Var);
                x340Var.r(z19);
                xu30Var2 = xu30VarR4;
            }
            if (function3 != null) {
                if (z5) {
                    gbxVar = new gbx(z50.c, function3);
                } else {
                    if (!ihc1.y0(str4)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    gbxVar = new gbx(new y50(str4), function3);
                }
                gbxVar2 = gbxVar;
            }
            gbx gbxVar4 = gbxVar2;
            j2i j2iVarR2 = apo.r(1799142499, new hb7(uri, huxVar, z18, z3, sfu0Var, z5), x340Var);
            str3 = str2;
            z8 = z5;
            z7 = z2;
            jto1.b(qim0VarB2, uvxVarA2, null, false, null, null, gbxVar4, null, null, j2iVarR2, null, xu30Var, apo.r(-343751647, new ib7(function0, function1, str3, z, z2, z8, vu30Var2), x340Var), xu30Var2, null, apo.r(-1664369538, new jb7(str3, i, z7, z8), x340Var), x340Var, 805306432, 196992, 17852);
            qim0Var2 = qim0Var3;
        } else {
            function3 = function2;
            str3 = str2;
            z7 = z2;
            z8 = z5;
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kb7(function0, function1, function3, str, huxVar, str3, z, z7, z3, qim0Var2, i, vu30Var, vu30Var2, vu30Var3, z4, z8, sfu0Var, z6, i2);
        }
    }

    public static final qim0 e(boolean z, boolean z2) {
        return pqo.h(nim0.a, (z || z2) ? false : true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(int i, int i2, b0k b0kVar, hcx hcxVar, c380 c380Var, qim0 qim0Var) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        qim0 qim0Var4;
        Uri uri;
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1498492794);
        int i4 = ((i & 6) == 0 ? i | (x340Var.e(hcxVar.ordinal()) ? 4 : 2) : i) | (x340Var.g(c380Var) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.g(qim0Var2) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var5 = nim0.a;
            if (i5 != 0) {
                qim0Var2 = qim0Var5;
            }
            if (c380Var.isEmpty()) {
                x340Var.i0(-291085601);
                qim0 qim0VarQ = i1p1.q(u291.r(qim0Var2, hcxVar.a(x340Var)), er31.a);
                uwr uwrVar = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarQ, cbx.a(x340Var).a.b.a(), d4o1.a);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                rnx rnxVar = rnx.c;
                long j = cbx.a(x340Var).b.b;
                switch (hcxVar.ordinal()) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        x340Var.i0(1992728201);
                        x340Var.r(false);
                        f = 8.0f;
                        break;
                    case 1:
                        x340Var.i0(1992726201);
                        zov0 zov0Var = cbx.b(x340Var).g;
                        x340Var.r(false);
                        f = 12.0f;
                        break;
                    case 2:
                        x340Var.i0(1992723416);
                        zov0 zov0Var2 = cbx.b(x340Var).g;
                        x340Var.r(false);
                        f = 16.0f;
                        break;
                    case 3:
                        x340Var.i0(1992720885);
                        zov0 zov0Var3 = cbx.b(x340Var).g;
                        x340Var.r(false);
                        f = 24.0f;
                        break;
                    case 4:
                        x340Var.i0(1992718697);
                        x340Var.r(false);
                        f = 28.0f;
                        break;
                    case 5:
                        x340Var.i0(1992717047);
                        zov0 zov0Var4 = cbx.b(x340Var).g;
                        x340Var.r(false);
                        f = 32.0f;
                        break;
                    case 6:
                        x340Var.i0(1992729641);
                        x340Var.r(false);
                        f = 10.0f;
                        break;
                    default:
                        throw p3d1.k(x340Var, 1992714860, false);
                }
                w0h1.a(rnxVar, isl.a, u291.r(qim0Var5, f), j, 0L, false, x340Var, rnx.d | 48, 48);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(false);
                qim0Var4 = qim0Var2;
            } else if (c380Var.size() == 1) {
                x340Var.i0(-290580983);
                w4i1 w4i1Var = (w4i1) o7h.q0(c380Var);
                String str = w4i1Var.c;
                if (str == null || (uri = Uri.parse(str)) == null) {
                    uri = Uri.EMPTY;
                }
                uri.getClass();
                qim0Var4 = qim0Var2;
                bmq0.a(uri, qim0Var4, hcxVar, w4i1Var.a, w4i1Var.b, bro1.q(w4i1Var.d), 0L, false, x340Var, ((i3 >> 3) & 112) | ((i3 << 6) & 896), 192);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                qim0Var4 = qim0Var2;
                x340Var.i0(-290238092);
                List<w4i1> listA1 = o7h.a1(c380Var, new p0d((byte) 3));
                ArrayList arrayList = new ArrayList(q7h.U(listA1, 10));
                for (w4i1 w4i1Var2 : listA1) {
                    String str2 = w4i1Var2.a;
                    String str3 = w4i1Var2.b;
                    String str4 = w4i1Var2.c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    arrayList.add(new phx(bro1.q(w4i1Var2.d), str4, str2, str3));
                }
                shx.a(mqo1.A(arrayList), qim0Var4, hcxVar, null, x340Var, ((i3 >> 3) & 112) | 8 | ((i3 << 6) & 896), 56);
                x340Var.r(false);
            }
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ika((byte) 1, i, i2, hcxVar, c380Var, qim0Var3);
        }
    }

    public static final void g(Uri uri, y7e1 y7e1Var, lz20 lz20Var, Function0 function0, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-992321097);
        int i2 = i | (x340Var.g(uri) ? 4 : 2) | (x340Var.i(y7e1Var) ? 32 : 16) | (x340Var.i(lz20Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i3 = (i2 & 14) | ((i2 >> 9) & 112);
            int i4 = i2 >> 3;
            b(uri, z, function0, null, x340Var, i3 | (i4 & 896));
            rwo1.a(y7e1Var, eyx.e, vby0.p(new wnb0(1.0f, true), lz20Var), null, cwl1.o0(x340Var, 2131952827), null, null, false, null, null, null, null, null, null, null, null, null, null, 0.0f, false, x340Var, i4 & 14, 0, 0, 2097128);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(uri, y7e1Var, lz20Var, function0, z, qim0Var2, i);
        }
    }

    public static final void h(Uri uri, boolean z, boolean z2, boolean z3, Function0 function0, iu30 iu30Var, Function0 function1, String str, String str2, Uri uri2, b0k b0kVar, int i) {
        int i2;
        boolean z4;
        boolean z5;
        iu30 iu30Var2;
        String str3;
        Uri uri3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1110467157);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(uri) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= x340Var.h(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            z5 = z3;
            i2 |= x340Var.h(z5) ? 2048 : 1024;
        } else {
            z5 = z3;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 131072 : 65536;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            str3 = str;
            i2 |= x340Var.g(str3) ? 8388608 : 4194304;
        } else {
            str3 = str;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var.g(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            uri3 = uri2;
            i2 |= x340Var.g(uri3) ? 536870912 : 268435456;
        } else {
            uri3 = uri2;
        }
        if (x340Var.Y(i2 & 1, (i2 & 306783379) != 306783378)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new grn(uri, z, z4, z5, function0, iu30Var2, function1, str3, str2, uri3, i, (byte) 0);
                    return;
                }
                return;
            }
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new y7e1(str2, 2);
                x340Var.s0(objT2);
            }
            y7e1 y7e1Var = (y7e1) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT3;
            boolean zI = x340Var.i(lz20Var);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new bu(lz20Var, (lnm) null, (byte) 9);
                x340Var.s0(objT4);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT4);
            boolean z6 = !z;
            boolean zI2 = ((i2 & 112) == 32) | x340Var.i(ven0Var) | ((i2 & 3670016) == 1048576);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new hrn(z, function1, ven0Var, (byte) 0);
                x340Var.s0(objT5);
            }
            x74.f((Function0) objT5, (scx) null, (mfx) null, z6, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(806271414, new jrn(str, y7e1Var, z3, ven0Var, function1, iu30Var, uri, uri2, lz20Var, function0, z2), x340Var), x340Var, 12607488, 48, 1894);
        } else {
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new grn(uri, z, z2, z3, function0, iu30Var, function1, str, str2, uri2, i, (byte) 1);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-113811200);
        if (x340Var.Y(i & 1, i != 0)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            wsx wsxVar = wsx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wsxVar, isl.a, u291.m(nim0Var, 16.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, wsx.d | 48, 48);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 6.0f));
            uwo1.e(cwl1.o0(x340Var, 2131955394), null, cbx.d(x340Var).g, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var, 1572864, 0, 1722);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvd1(i, (byte) 25);
        }
    }

    public static final void j(int i, String str, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var;
        qim0 qim0Var2;
        long j;
        qim0 qim0VarB;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-513465174);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(function1) ? 2048 : 1024) | 24576;
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strO0 = cwl1.o0(x340Var2, 2131952821);
            lee1 lee1Var = cbx.d(x340Var2).g;
            long j2 = cbx.a(x340Var2).b.a;
            boolean z2 = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new j3n(function0, (byte) 6);
                x340Var2.s0(objT);
            }
            uwo1.e(strO0, bin.x(qim0Var3, false, null, null, null, (Function0) objT, 15), lee1Var, j2, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
            uwo1.e(str, null, cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, i2 & 14, 0, 2034);
            String strO1 = cwl1.o0(x340Var2, 2131952825);
            lee1 lee1Var2 = cbx.d(x340Var2).h;
            if (z) {
                x340Var2.i0(887836690);
                j = cbx.a(x340Var2).b.c;
            } else {
                x340Var2.i0(887837933);
                j = cbx.a(x340Var2).b.b;
            }
            x340Var2.r(false);
            if (z) {
                x340Var2.i0(887839932);
                boolean z3 = (i2 & 7168) == 2048;
                Object objT2 = x340Var2.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new j3n(function1, (byte) 7);
                    x340Var2.s0(objT2);
                }
                qim0VarB = bin.x(qim0Var3, false, null, null, null, (Function0) objT2, 15);
                qim0Var2 = qim0Var3;
            } else {
                qim0Var2 = qim0Var3;
                x340Var2.i0(887841118);
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = eln.h;
                    x340Var2.s0(objT3);
                }
                qim0VarB = s161.b(qim0Var2, false, (iu30) objT3);
            }
            x340Var2.r(false);
            uwo1.e(strO1, qim0VarB, lee1Var2, j, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb7(str, z, function0, function1, qim0Var2, i);
        }
    }

    public static final void k(sfu0 sfu0Var, b0k b0kVar, int i) {
        float fS;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1069413255);
        int i2 = (x340Var.i(sfu0Var) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = sfu0Var instanceof rfu0;
            m4c m4cVar = fkj0.X;
            x340Var.i0(-2120724660);
            if (z) {
                boolean zG = x340Var.g(sfu0Var);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = yv91.a(new i26(sfu0Var, (byte) 12));
                    x340Var.s0(objT);
                }
                tob1 tob1Var = (tob1) objT;
                boolean zG2 = x340Var.g((qkw0) tob1Var.getValue());
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = us71.i(((qkw0) tob1Var.getValue()).a, x340Var);
                }
                drr0 drr0Var = (drr0) objT2;
                qkw0 qkw0Var = (qkw0) tob1Var.getValue();
                boolean zI = x340Var.i(tob1Var) | x340Var.i(drr0Var);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new k96(tob1Var, drr0Var, (lnm) null, (byte) 10);
                    x340Var.s0(objT3);
                }
                qxd0.t(qkw0Var, x340Var, (vu30) objT3);
                fS = drr0Var.s();
                x340Var.r(false);
            } else {
                x340Var.r(false);
                fS = 0.0f;
            }
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = h2cVar.b(nim0Var);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarB, ((vex) zex.a.e).c, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (!z || fS <= 0.0f) {
                x340Var.i0(-435281821);
                x340Var.r(false);
            } else {
                x340Var.i0(-435544174);
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = fz6.d1;
                    x340Var.s0(objT4);
                }
                xto1.f(fS, 4, 384, 0, cbx.a(x340Var).b.a, u7h.j, x340Var, s161.a(nim0Var, (iu30) objT4));
                x340Var.r(false);
            }
            spx spxVar = z ? spx.c : xpx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(spxVar, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var, 56, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mu6(sfu0Var, i, (byte) 6);
        }
    }

    public static final void l(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1375327160);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131960567);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            znx znxVar = znx.c;
            jsl jslVar = new jsl(strO0);
            qim0 qim0VarM = u291.m(nim0Var, cbx.b(x340Var).b.a);
            cvx cvxVar2 = cbx.b(x340Var).b;
            w0h1.a(znxVar, jslVar, uyn1.B(qim0VarM, 0.0f, 0.0f, 6.0f, 0.0f, 11), cbx.a(x340Var).b.a, 0L, false, x340Var, znx.d, 48);
            uwo1.e(strO0, null, cbx.d(x340Var).j, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var, 1572864, 0, 1722);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvd1(i, (byte) 26);
        }
    }

    public static final void m(zzz0 zzz0Var, c101 c101Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        iu30 iu30Var3;
        float f;
        float f2;
        m4c m4cVar = fkj0.X;
        xzz0 xzz0Var = zzz0Var.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1103361117);
        int i2 = i | (x340Var.g(zzz0Var) ? 32 : 16) | (x340Var.i(c101Var) ? 256 : 128) | (x340Var.i(iu30Var2) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarA = h2c.a.a(nim0.a, xzz0Var.a() ? een.Y : een.t);
            if (xzz0Var.a()) {
                x340Var.i0(526900485);
                x340Var.r(false);
                f = 0.0f;
            } else {
                x340Var.i0(526901383);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 16.0f;
            }
            if (xzz0Var.a()) {
                x340Var.i0(526903623);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f2 = 16.0f;
            } else {
                x340Var.i0(526904005);
                x340Var.r(false);
                f2 = 0.0f;
            }
            qim0 qim0VarB = uyn1.B(qim0VarA, f, 0.0f, f2, 0.0f, 10);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                iu30Var3 = iu30Var;
                objT = new ppv0(iu30Var3, (byte) 27);
                x340Var.s0(objT);
            } else {
                iu30Var3 = iu30Var;
            }
            qim0 qim0VarX = ern1.x(qim0VarB, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str = zzz0Var.j;
            List list = zzz0Var.k;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!u890.j(((gxz0) obj).c.a, xzz0Var.a.a)) {
                    arrayList.add(obj);
                }
            }
            boolean z = !xzz0Var.a();
            boolean z2 = ((57344 & i2) == 16384) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new t8e0(iu30Var2, zzz0Var, (byte) 1);
                x340Var.s0(objT2);
            }
            otw.c(c101Var, new a101(str, 3, arrayList, z, (iu30) objT2), (qim0) null, (ipb1) null, x340Var, (i2 >> 6) & 14, 12);
            x340Var.r(true);
        } else {
            iu30Var3 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(zzz0Var, c101Var, iu30Var3, iu30Var2, i, (byte) 3);
        }
    }

    public static final void n(r7x0 r7x0Var, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean z2 = r7x0Var.u;
        boolean z3 = r7x0Var.m;
        boolean z4 = r7x0Var.l;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(513946908);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(r7x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0Var, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z5 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (z4) {
                x340Var.i0(-329572083);
                l(x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-329538448);
                x340Var.r(false);
            }
            fra fraVar = een.N0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            x340Var.i0(-921602851);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 0.0f, 12.0f, 0.0f, 11);
            if (z3) {
                boolean z6 = (i2 & 896) == 256;
                Object objT = x340Var.T();
                if (z6 || objT == fkj0.X) {
                    objT = new uyh1(iu30Var, (byte) 14);
                    x340Var.s0(objT);
                }
                qim0VarB2 = qim0VarB2.then(bin.x(nim0Var, false, null, null, null, (Function0) objT, 15));
            }
            x340Var.r(false);
            int i3 = i2;
            uwo1.e(r7x0Var.b, qim0VarB2, cbx.d(x340Var).d, 0L, null, null, 0, true, new cjc0(2), 0, null, x340Var, 12582912, 0, 1656);
            x340Var = x340Var;
            if (r7x0Var.e) {
                x340Var.i0(1495381905);
                wtx wtxVar = wtx.c;
                jsl jslVar = new jsl(cwl1.o0(x340Var, 2131963731));
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(wtxVar, jslVar, u291.m(nim0Var, 16.0f), 0L, f5p1.k(x340Var, 2131100198), true, x340Var, wtx.d | 196608, 8);
                x340Var.r(false);
            } else {
                x340Var.i0(1495807628);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (z2) {
                x340Var.i0(-328579339);
                i(x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-328553392);
                x340Var.r(false);
            }
            String str = r7x0Var.o;
            if (str == null || z4 || z2 || !r7x0Var.p) {
                str = null;
            }
            if (str == null) {
                x340Var.i0(-328435562);
                x340Var.r(false);
            } else {
                x340Var.i0(-328435561);
                uwo1.e(str, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, null, 0, null, x340Var, 1572864, 0, 1970);
                x340Var = x340Var;
                x340Var.r(false);
            }
            String str2 = r7x0Var.n;
            if (str2 == null || z4) {
                str2 = null;
            }
            if (str2 == null) {
                x340Var.i0(-328162142);
                x340Var.r(false);
            } else {
                x340Var.i0(-328162141);
                x340 x340Var2 = x340Var;
                uwo1.e(str2, null, cbx.d(x340Var).j, 0L, null, null, 2, false, null, 0, null, x340Var2, 1572864, 0, 1978);
                x340Var = x340Var2;
                x340Var.r(false);
            }
            if (z3 || r7x0Var.g) {
                x340Var.i0(-327879080);
                cvx cvxVar3 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h((qim0) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02c7: INVOKE 
                      (r15v10 'x340Var' p.x340)
                      (wrap p.qim0:0x02c3: INVOKE (wrap p.qim0:?: CAST (p.qim0) (r24v0 ?? I:??[OBJECT, ARRAY])), (8.0f float) STATIC call: p.u291.h(p.qim0, float):p.qim0 A[WRAPPED] (LINE:708))
                     STATIC call: p.op71.g(p.b0k, p.qim0):void (LINE:712) in method: p.aqo1.n(p.r7x0, boolean, p.iu30, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 753
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.aqo1.n(p.r7x0, boolean, p.iu30, p.qim0, p.b0k, int):void");
            }

            public static final void o(xbk1 xbk1Var, oe41 oe41Var, x8c0 x8c0Var) {
                ge41 ge41Var = (ge41) xbk1Var.R("androidx.lifecycle.savedstate.vm.tag");
                if (ge41Var == null || ge41Var.c) {
                    return;
                }
                ge41Var.a(x8c0Var, oe41Var);
                y(x8c0Var, oe41Var);
            }

            public static final String p(ufs ufsVar, String str, long j, long j2, boolean z) {
                tfs tfsVarA = ufsVar.a(str, (int) j2, (int) j, null, false, false);
                tfsVarA.i = false;
                tfsVarA.g = true;
                if (!z) {
                    tfsVarA.h = true;
                }
                tfsVarA.g("d MMM yyyy");
                tfsVarA.f = 2;
                String strA = tfsVarA.a();
                if (ihc1.y0(strA)) {
                    return null;
                }
                return strA;
            }

            public static final ge41 q(oe41 oe41Var, x8c0 x8c0Var, String str, Bundle bundle) {
                fe41 fe41Var;
                Bundle bundleA = oe41Var.a(str);
                if (bundleA != null) {
                    bundle = bundleA;
                }
                if (bundle == null) {
                    fe41Var = new fe41();
                } else {
                    ClassLoader classLoader = fe41.class.getClassLoader();
                    classLoader.getClass();
                    bundle.setClassLoader(classLoader);
                    xkg0 xkg0Var = new xkg0(bundle.size());
                    for (String str2 : bundle.keySet()) {
                        str2.getClass();
                        xkg0Var.put(str2, bundle.get(str2));
                    }
                    fe41Var = new fe41(xkg0Var.b());
                }
                ge41 ge41Var = new ge41(str, fe41Var);
                ge41Var.a(x8c0Var, oe41Var);
                y(x8c0Var, oe41Var);
                return ge41Var;
            }

            public static final String r(Context context, hi90 hi90Var) {
                if (hi90Var instanceof vh90) {
                    return f4i1.f(context.getString(2131952539), " • ", ((vh90) hi90Var).d);
                }
                if (hi90Var instanceof bh90) {
                    return f4i1.f(context.getString(2131952506), " • ", o7h.y0(((bh90) hi90Var).h, ", ", (String) null, (String) null, (iu30) null, 62));
                }
                if (hi90Var instanceof oh90) {
                    String string = context.getString(2131952535);
                    string.getClass();
                    return string;
                }
                if (hi90Var instanceof yh90) {
                    return f4i1.f(context.getString(2131952541), " • ", o7h.y0(((yh90) hi90Var).X, ", ", (String) null, (String) null, ljc1.t, 30));
                }
                if (hi90Var instanceof ch90) {
                    String string2 = context.getString(2131952509);
                    string2.getClass();
                    return string2;
                }
                if (hi90Var instanceof jh90) {
                    return f4i1.f(context.getString(2131952518), " • ", ((jh90) hi90Var).d);
                }
                if (hi90Var instanceof eh90) {
                    return f4i1.f(context.getString(2131952510), " • ", o7h.y0(((eh90) hi90Var).Y, (CharSequence) null, (String) null, (String) null, (iu30) null, 63));
                }
                eg.o();
                return null;
            }

            public static final go80 s(klm klmVar, qcp0 qcp0Var) {
                return klmVar.a("ActiveDeviceIdSaverDaemon", new ivn0(qcp0Var, (byte) 29));
            }

            /* JADX WARN: Code duplicated, block: B:29:0x0177  */
            /* JADX WARN: Code duplicated, block: B:30:0x017b  */
            /* JADX WARN: Code duplicated, block: B:33:0x018c  */
            /* JADX WARN: Code duplicated, block: B:35:0x0190  */
            /* JADX WARN: Code duplicated, block: B:38:0x019d  */
            /* JADX WARN: Code duplicated, block: B:40:0x01a0  */
            public static final hob1 t(mey0 mey0Var, t810 t810Var, hei0 hei0Var, fza fzaVar, ytp0 ytp0Var, iu30 iu30Var) {
                boolean z;
                boolean z2;
                nrl nrlVar;
                long j;
                Long l;
                nbw0 nbw0Var = hei0Var.a;
                xkk1 xkk1Var = hei0Var.e;
                yo60 yo60Var = hei0Var.b;
                prl prlVar = hei0Var.d;
                er00 er00VarG = upo1.G(l8i0.a, nbw0Var, yo60Var, null, "", fza.h(nbw0Var.j), t810Var.c, false, 132);
                int i = yo60Var.i;
                String str = mey0Var.d;
                boolean z3 = t810Var.g;
                boolean z4 = t810Var.h;
                String str2 = nbw0Var.a;
                wcm wcmVarP = bpo1.p(str, null, z3, z4, false, false, null, null, str2, t810Var.s, iu30Var, false, null, null, 58318);
                String str3 = mey0Var.a;
                String str4 = mey0Var.c;
                zkm zkmVar = t810Var.b;
                String str5 = mey0Var.d;
                boolean zS = p2o1.s(zkmVar, str5);
                boolean zV = p2o1.v(zkmVar, str5);
                String str6 = nbw0Var.e;
                String str7 = nbw0Var.f;
                boolean zV2 = upo1.v(t810Var, str7);
                x360 x360Var = mey0Var.e;
                mbw0 mbw0VarV = x360Var != null ? bpo1.v(x360Var) : null;
                k4m k4mVarF = upo1.F(i);
                Set set = s4b1.f;
                lfi0 lfi0VarR = bpo1.r(nbw0Var, xkk1Var, null, ytp0Var, null, false, k4mVarF, wcmVarP, null, null, true, !(uic.i(str5, s4b1.g) || uic.g(str5, blc0.Yc)), t810Var.g, false, false, false, false, false, t810Var.r, null, null, null, null, false, false, null, null, 133948180);
                k4m k4mVarF2 = upo1.F(nbw0Var.l);
                String str8 = mey0Var.a;
                String str9 = mey0Var.d;
                gab0 gab0Var = nbw0Var.m;
                String str10 = gab0Var.a;
                jo70 jo70Var = hei0Var.c;
                if (jo70Var == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                List list = jo70Var.d;
                String strF = jo70Var.a;
                if (!list.isEmpty()) {
                    strF = f4i1.f(o7h.y0(list, ", ", (String) null, (String) null, nei0.b, 30), " - ", strF);
                }
                String str11 = strF;
                String str12 = gab0Var.b;
                hwt hwtVar = t810Var.c;
                if ((er00VarG instanceof dr00) && hwtVar != null) {
                    z = true;
                    if (hwtVar.d) {
                        z2 = false;
                    }
                    yaw0 yaw0VarU = bpo1.u(512, str8, str9, str10, str11, str12, k4mVarF2, false, z2, false, false);
                    set0 set0VarS = bpo1.s(mey0Var.d, null, (494 & 4) != 0 ? false : false, null, false, (494 & 32) != 0 ? null : null, (494 & 64) != 0 ? null : null, (494 & 128) != 0 ? false : false, false);
                    uho uhoVarQ = bpo1.q(str7, str5, str2);
                    String str13 = mey0Var.b;
                    String str14 = mey0Var.a;
                    hwt hwtVar2 = t810Var.c;
                    String str15 = mey0Var.c;
                    if (prlVar != null) {
                        nrlVar = prlVar.c;
                    } else {
                        nrlVar = null;
                    }
                    lsm0 lsm0VarR = bwp0.r(yo60Var, str15, str15, false, hwtVar2, true, nrlVar);
                    if (t810Var.g) {
                        j = 1000;
                    } else {
                        j = 0;
                    }
                    long j2 = j;
                    if (t810Var.u) {
                        l = 3000L;
                    } else {
                        l = null;
                    }
                    boolean z5 = t810Var.g;
                    return new hob1(str3, str4, str4, str6, nbw0Var.p.b, zV, zS, er00VarG, zV2, mbw0VarV, lfi0VarR, yaw0VarU, (xfn0) null, set0VarS, wcmVarP, uhoVarQ, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, (m9g1) null, (ch7) null, new sbw0(str13, str14, lsm0VarR, j2, z5, false, !t810Var.t, l, 672), 0L, z5, false, (Integer) null, false, false, false, mey0Var.e, x(i), t810Var.p, false, (sq51) null, (String) null, (String) null, false, t810Var.r, mey0Var.i, (c5v0) null, -83947520, 1272);
                }
                z = true;
                z2 = z;
                yaw0 yaw0VarU2 = bpo1.u(512, str8, str9, str10, str11, str12, k4mVarF2, false, z2, false, false);
                set0 set0VarS2 = bpo1.s(mey0Var.d, null, (494 & 4) != 0 ? false : false, null, false, (494 & 32) != 0 ? null : null, (494 & 64) != 0 ? null : null, (494 & 128) != 0 ? false : false, false);
                uho uhoVarQ2 = bpo1.q(str7, str5, str2);
                String str16 = mey0Var.b;
                String str17 = mey0Var.a;
                hwt hwtVar3 = t810Var.c;
                String str18 = mey0Var.c;
                if (prlVar != null) {
                    nrlVar = prlVar.c;
                } else {
                    nrlVar = null;
                }
                lsm0 lsm0VarR2 = bwp0.r(yo60Var, str18, str18, false, hwtVar3, true, nrlVar);
                if (t810Var.g) {
                    j = 1000;
                } else {
                    j = 0;
                }
                long j3 = j;
                if (t810Var.u) {
                    l = 3000L;
                } else {
                    l = null;
                }
                boolean z6 = t810Var.g;
                return new hob1(str3, str4, str4, str6, nbw0Var.p.b, zV, zS, er00VarG, zV2, mbw0VarV, lfi0VarR, yaw0VarU2, (xfn0) null, set0VarS2, wcmVarP, uhoVarQ2, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, (m9g1) null, (ch7) null, new sbw0(str16, str17, lsm0VarR2, j3, z6, false, !t810Var.t, l, 672), 0L, z6, false, (Integer) null, false, false, false, mey0Var.e, x(i), t810Var.p, false, (sq51) null, (String) null, (String) null, false, t810Var.r, mey0Var.i, (c5v0) null, -83947520, 1272);
            }

            public static final hgx u(vfx vfxVar) {
                return new hgx(vfxVar.a, vfxVar.b, (byte) 1);
            }

            public static final lt20 v(Flowable flowable) {
                vbm[] vbmVarArr = q601.a;
                return new lt20(rqt0.u(new h801(new kge(flowable), (byte) 4)), new bi61(3, (lnm) null, (byte) 0), (byte) 0);
            }

            public static final OopsMetricEvent w(aqj0 aqj0Var) {
                viq0 viq0VarN = OopsMetricEvent.n();
                viq0VarN.w(aqj0Var.a.toString());
                npj0 npj0Var = aqj0Var.b;
                viq0VarN.x(npj0Var.a);
                viq0VarN.A(aqj0Var.i);
                long j = aqj0Var.g;
                viq0VarN.z(j);
                viq0VarN.s(aqj0Var.h - j);
                viq0VarN.D(npj0Var.c.a());
                viq0VarN.v(npj0Var.b.a);
                viq0VarN.t(v8i0.c(aqj0Var.j));
                viq0VarN.y(aqj0Var.m);
                String str = aqj0Var.f;
                if (str != null) {
                    viq0VarN.r(str);
                }
                viq0VarN.q(aqj0Var.k);
                Long l = aqj0Var.l;
                if (l != null) {
                    viq0VarN.B(l.longValue() * 1000);
                }
                lpj0 lpj0Var = aqj0Var.e;
                if (lpj0Var != null) {
                    if (lpj0Var instanceof lpj0) {
                        viq0VarN.n(lpj0Var.a);
                    } else {
                        if (!(lpj0Var instanceof kpj0)) {
                            eg.o();
                            return null;
                        }
                        viq0VarN.u(i0p1.u(((kpj0) lpj0Var).a));
                    }
                }
                return viq0VarN.build();
            }

            public static final m4m x(int i) {
                int iC = l1d.C(i);
                if (iC != 0) {
                    if (iC == 1) {
                        return m4m.b;
                    }
                    if (iC == 2) {
                        return m4m.a;
                    }
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                }
                return m4m.c;
            }

            public static void y(x8c0 x8c0Var, oe41 oe41Var) {
                w8c0 w8c0VarB = x8c0Var.b();
                if (w8c0VarB == w8c0.b || w8c0VarB.a(w8c0.d)) {
                    oe41Var.d();
                } else {
                    x8c0Var.a(new it0(x8c0Var, oe41Var, (byte) 5));
                }
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public static void z(Object obj, Object obj2) {
                rin1 rin1Var = (rin1) obj;
                bkn1 bkn1Var = rin1Var.zzc;
                bkn1 bkn1Var2 = ((rin1) obj2).zzc;
                bkn1 bkn1Var3 = bkn1.f;
                if (!bkn1Var3.equals(bkn1Var2)) {
                    if (bkn1Var3.equals(bkn1Var)) {
                        int i = bkn1Var.a + bkn1Var2.a;
                        int[] iArrCopyOf = Arrays.copyOf(bkn1Var.b, i);
                        System.arraycopy(bkn1Var2.b, 0, iArrCopyOf, bkn1Var.a, bkn1Var2.a);
                        Object[] objArrCopyOf = Arrays.copyOf(bkn1Var.c, i);
                        System.arraycopy(bkn1Var2.c, 0, objArrCopyOf, bkn1Var.a, bkn1Var2.a);
                        bkn1Var = new bkn1(i, iArrCopyOf, objArrCopyOf, true);
                    } else {
                        bkn1Var.getClass();
                        if (!bkn1Var2.equals(bkn1Var3)) {
                            if (!bkn1Var.e) {
                                k220.c();
                                return;
                            }
                            int i2 = bkn1Var.a + bkn1Var2.a;
                            bkn1Var.e(i2);
                            System.arraycopy(bkn1Var2.b, 0, bkn1Var.b, bkn1Var.a, bkn1Var2.a);
                            System.arraycopy(bkn1Var2.c, 0, bkn1Var.c, bkn1Var.a, bkn1Var2.a);
                            bkn1Var.a = i2;
                        }
                    }
                }
                rin1Var.zzc = bkn1Var;
            }
        }
