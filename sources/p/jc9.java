package p;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.datastore.preferences.protobuf.a;
import com.google.protobuf.Timestamp;
import com.google.type.Interval;
import com.spotify.agentstories.v1.SendStoryFeedbackRequest;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.campfire.insights.proto.v1.EntityMatchContent;
import com.spotify.campfire.insights.proto.v1.GetInsightsRequest;
import com.spotify.campfire.insights.proto.v1.GetInsightsResponse;
import com.spotify.campfire.insights.proto.v1.InsightItem;
import com.spotify.campfire.insights.proto.v1.SpotlightContent;
import com.spotify.campfire.insights.proto.v1.TasteMatchContent;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Producer;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import spotify.your_library.esperanto.proto.IsCuratedResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public class jc9 implements Function, oah, l6u0, io20, BiFunction, u28, Producer, xi7, r8m, g210, ya, lc51 {
    public final /* synthetic */ byte a;
    public final Object b;

    public jc9(qwg qwgVar) {
        this.a = (byte) 18;
        n290.a(qwgVar, "output");
        this.b = qwgVar;
        qwgVar.k = this;
    }

    public static jc9 m(qwg qwgVar) {
        jc9 jc9Var = qwgVar.k;
        return jc9Var != null ? jc9Var : new jc9(qwgVar);
    }

    public static q8m s(sy21 sy21Var) {
        ry21 ry21Var = sy21Var.a;
        return ry21Var.Q0 ? p8m.a : new o8m(new Exception(f4i1.c(ry21Var.d, "Failed to submit feedback, status: ")));
    }

    public void A(int i, int i2) {
        ((qwg) this.b).j1(i, i2);
    }

    public void B(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qwgVar.j1(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int iC0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC0 += qwg.C0(((Integer) list.get(i3)).intValue());
        }
        qwgVar.r1(iC0);
        while (i2 < list.size()) {
            qwgVar.k1(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void C(int i, int i2) {
        ((qwg) this.b).e1(i, i2);
    }

    public void D(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qwgVar.e1(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        qwgVar.r1(i3);
        while (i2 < list.size()) {
            qwgVar.f1(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void E(int i, long j) {
        ((qwg) this.b).g1(i, j);
    }

    public void F(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qwgVar.g1(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        qwgVar.r1(i3);
        while (i2 < list.size()) {
            qwgVar.h1(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void G(float f, int i) {
        qwg qwgVar = (qwg) this.b;
        qwgVar.getClass();
        qwgVar.e1(i, Float.floatToRawIntBits(f));
    }

    public void H(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                qwgVar.getClass();
                qwgVar.e1(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        qwgVar.r1(i3);
        while (i2 < list.size()) {
            qwgVar.i1(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public void I(int i, Object obj, tm41 tm41Var) {
        qwg qwgVar = (qwg) this.b;
        qwgVar.p1(i, 3);
        tm41Var.f((a) obj, qwgVar.k);
        qwgVar.p1(i, 4);
    }

    public void J(int i, List list, tm41 tm41Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            I(i, list.get(i2), tm41Var);
        }
    }

    public void K(int i, int i2) {
        ((qwg) this.b).j1(i, i2);
    }

    public void L(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qwgVar.j1(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int iC0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC0 += qwg.C0(((Integer) list.get(i3)).intValue());
        }
        qwgVar.r1(iC0);
        while (i2 < list.size()) {
            qwgVar.k1(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void M(int i, long j) {
        ((qwg) this.b).s1(i, j);
    }

    public void N(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qwgVar.s1(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int iV0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iV0 += qwg.V0(((Long) list.get(i3)).longValue());
        }
        qwgVar.r1(iV0);
        while (i2 < list.size()) {
            qwgVar.t1(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010e  */
    /* JADX WARN: Code duplicated, block: B:45:0x011b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0127  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:48:0x013a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x014e  */
    /* JADX WARN: Code duplicated, block: B:52:0x015a  */
    /* JADX WARN: Code duplicated, block: B:54:0x015e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0166  */
    /* JADX WARN: Code duplicated, block: B:56:0x016d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0174  */
    /* JADX WARN: Code duplicated, block: B:58:0x017b  */
    /* JADX WARN: Code duplicated, block: B:60:0x017f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0186  */
    /* JADX WARN: Code duplicated, block: B:62:0x018d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0194  */
    /* JADX WARN: Code duplicated, block: B:64:0x019a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x0117 A[SYNTHETIC] */
    public void O(int i, uo5 uo5Var, rng0 rng0Var) {
        int iE0;
        int iR0;
        dul1 dul1Var = (mul1) uo5Var.c;
        dul1 dul1Var2 = (mul1) uo5Var.b;
        qwg qwgVar = (qwg) this.b;
        qwgVar.getClass();
        for (Map.Entry entry : rng0Var.entrySet()) {
            qwgVar.p1(i, 2);
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = n220.c;
            int iR1 = qwg.R0(1);
            dul1 dul1Var3 = mul1.d;
            if (dul1Var2 == dul1Var3) {
                iR1 *= 2;
            }
            int iE1 = 8;
            switch (dul1Var2.ordinal()) {
                case 0:
                    ((Double) key).getClass();
                    iE0 = 8;
                    int i3 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key2 = entry.getKey();
                            Object value2 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key2);
                            n220.b(qwgVar, dul1Var, 2, value2);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key3 = entry.getKey();
                            Object value3 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key3);
                            n220.b(qwgVar, dul1Var, 2, value3);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key4 = entry.getKey();
                            Object value4 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key4);
                            n220.b(qwgVar, dul1Var, 2, value4);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key5 = entry.getKey();
                            Object value5 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key5);
                            n220.b(qwgVar, dul1Var, 2, value5);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key6 = entry.getKey();
                            Object value6 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key6);
                            n220.b(qwgVar, dul1Var, 2, value6);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key7 = entry.getKey();
                            Object value7 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key7);
                            n220.b(qwgVar, dul1Var, 2, value7);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key8 = entry.getKey();
                            Object value8 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key8);
                            n220.b(qwgVar, dul1Var, 2, value8);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key9 = entry.getKey();
                            Object value9 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key9);
                            n220.b(qwgVar, dul1Var, 2, value9);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key10 = entry.getKey();
                            Object value10 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key10);
                            n220.b(qwgVar, dul1Var, 2, value10);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key11 = entry.getKey();
                            Object value11 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11);
                            n220.b(qwgVar, dul1Var, 2, value11);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key12 = entry.getKey();
                            Object value12 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key12);
                            n220.b(qwgVar, dul1Var, 2, value12);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key13 = entry.getKey();
                            Object value13 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key13);
                            n220.b(qwgVar, dul1Var, 2, value13);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key14 = entry.getKey();
                            Object value14 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key14);
                            n220.b(qwgVar, dul1Var, 2, value14);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key15 = entry.getKey();
                            Object value15 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key15);
                            n220.b(qwgVar, dul1Var, 2, value15);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i3);
                            Object key16 = entry.getKey();
                            Object value16 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key16);
                            n220.b(qwgVar, dul1Var, 2, value16);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i3);
                    Object key17 = entry.getKey();
                    Object value17 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key17);
                    n220.b(qwgVar, dul1Var, 2, value17);
                    break;
                case 1:
                    ((Float) key).getClass();
                    iE0 = 4;
                    int i4 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key18 = entry.getKey();
                            Object value18 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key18);
                            n220.b(qwgVar, dul1Var, 2, value18);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key19 = entry.getKey();
                            Object value19 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key19);
                            n220.b(qwgVar, dul1Var, 2, value19);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key110 = entry.getKey();
                            Object value110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key110);
                            n220.b(qwgVar, dul1Var, 2, value110);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key111 = entry.getKey();
                            Object value111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111);
                            n220.b(qwgVar, dul1Var, 2, value111);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key112 = entry.getKey();
                            Object value112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key112);
                            n220.b(qwgVar, dul1Var, 2, value112);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key113 = entry.getKey();
                            Object value113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key113);
                            n220.b(qwgVar, dul1Var, 2, value113);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key114 = entry.getKey();
                            Object value114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key114);
                            n220.b(qwgVar, dul1Var, 2, value114);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key115 = entry.getKey();
                            Object value115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key115);
                            n220.b(qwgVar, dul1Var, 2, value115);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key116 = entry.getKey();
                            Object value116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key116);
                            n220.b(qwgVar, dul1Var, 2, value116);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key117 = entry.getKey();
                            Object value117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key117);
                            n220.b(qwgVar, dul1Var, 2, value117);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key118 = entry.getKey();
                            Object value118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key118);
                            n220.b(qwgVar, dul1Var, 2, value118);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key119 = entry.getKey();
                            Object value119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key119);
                            n220.b(qwgVar, dul1Var, 2, value119);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key1110 = entry.getKey();
                            Object value1110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1110);
                            n220.b(qwgVar, dul1Var, 2, value1110);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key1111 = entry.getKey();
                            Object value1111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111);
                            n220.b(qwgVar, dul1Var, 2, value1111);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i4);
                            Object key1112 = entry.getKey();
                            Object value1112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1112);
                            n220.b(qwgVar, dul1Var, 2, value1112);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i4);
                    Object key1113 = entry.getKey();
                    Object value1113 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key1113);
                    n220.b(qwgVar, dul1Var, 2, value1113);
                    break;
                case 2:
                    iE0 = qwg.E0(((Long) key).longValue());
                    int i5 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key1114 = entry.getKey();
                            Object value1114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1114);
                            n220.b(qwgVar, dul1Var, 2, value1114);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key1115 = entry.getKey();
                            Object value1115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1115);
                            n220.b(qwgVar, dul1Var, 2, value1115);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key1116 = entry.getKey();
                            Object value1116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1116);
                            n220.b(qwgVar, dul1Var, 2, value1116);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key1117 = entry.getKey();
                            Object value1117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1117);
                            n220.b(qwgVar, dul1Var, 2, value1117);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key1118 = entry.getKey();
                            Object value1118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1118);
                            n220.b(qwgVar, dul1Var, 2, value1118);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key1119 = entry.getKey();
                            Object value1119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1119);
                            n220.b(qwgVar, dul1Var, 2, value1119);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key11110 = entry.getKey();
                            Object value11110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11110);
                            n220.b(qwgVar, dul1Var, 2, value11110);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key11111 = entry.getKey();
                            Object value11111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111);
                            n220.b(qwgVar, dul1Var, 2, value11111);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key11112 = entry.getKey();
                            Object value11112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11112);
                            n220.b(qwgVar, dul1Var, 2, value11112);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key11113 = entry.getKey();
                            Object value11113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11113);
                            n220.b(qwgVar, dul1Var, 2, value11113);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key11114 = entry.getKey();
                            Object value11114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11114);
                            n220.b(qwgVar, dul1Var, 2, value11114);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key11115 = entry.getKey();
                            Object value11115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11115);
                            n220.b(qwgVar, dul1Var, 2, value11115);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key11116 = entry.getKey();
                            Object value11116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11116);
                            n220.b(qwgVar, dul1Var, 2, value11116);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key11117 = entry.getKey();
                            Object value11117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11117);
                            n220.b(qwgVar, dul1Var, 2, value11117);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i5);
                            Object key11118 = entry.getKey();
                            Object value11118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11118);
                            n220.b(qwgVar, dul1Var, 2, value11118);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i5);
                    Object key11119 = entry.getKey();
                    Object value11119 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key11119);
                    n220.b(qwgVar, dul1Var, 2, value11119);
                    break;
                case 3:
                    iE0 = qwg.V0(((Long) key).longValue());
                    int i6 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key111110 = entry.getKey();
                            Object value111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111110);
                            n220.b(qwgVar, dul1Var, 2, value111110);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key111111 = entry.getKey();
                            Object value111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111);
                            n220.b(qwgVar, dul1Var, 2, value111111);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key111112 = entry.getKey();
                            Object value111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111112);
                            n220.b(qwgVar, dul1Var, 2, value111112);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key111113 = entry.getKey();
                            Object value111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111113);
                            n220.b(qwgVar, dul1Var, 2, value111113);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key111114 = entry.getKey();
                            Object value111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111114);
                            n220.b(qwgVar, dul1Var, 2, value111114);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key111115 = entry.getKey();
                            Object value111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111115);
                            n220.b(qwgVar, dul1Var, 2, value111115);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key111116 = entry.getKey();
                            Object value111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111116);
                            n220.b(qwgVar, dul1Var, 2, value111116);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key111117 = entry.getKey();
                            Object value111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111117);
                            n220.b(qwgVar, dul1Var, 2, value111117);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key111118 = entry.getKey();
                            Object value111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111118);
                            n220.b(qwgVar, dul1Var, 2, value111118);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key111119 = entry.getKey();
                            Object value111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111119);
                            n220.b(qwgVar, dul1Var, 2, value111119);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key1111110 = entry.getKey();
                            Object value1111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111110);
                            n220.b(qwgVar, dul1Var, 2, value1111110);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key1111111 = entry.getKey();
                            Object value1111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111);
                            n220.b(qwgVar, dul1Var, 2, value1111111);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key1111112 = entry.getKey();
                            Object value1111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111112);
                            n220.b(qwgVar, dul1Var, 2, value1111112);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key1111113 = entry.getKey();
                            Object value1111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111113);
                            n220.b(qwgVar, dul1Var, 2, value1111113);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i6);
                            Object key1111114 = entry.getKey();
                            Object value1111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111114);
                            n220.b(qwgVar, dul1Var, 2, value1111114);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i6);
                    Object key1111115 = entry.getKey();
                    Object value1111115 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key1111115);
                    n220.b(qwgVar, dul1Var, 2, value1111115);
                    break;
                case 4:
                    iE0 = qwg.C0(((Integer) key).intValue());
                    int i7 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key1111116 = entry.getKey();
                            Object value1111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111116);
                            n220.b(qwgVar, dul1Var, 2, value1111116);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key1111117 = entry.getKey();
                            Object value1111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111117);
                            n220.b(qwgVar, dul1Var, 2, value1111117);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key1111118 = entry.getKey();
                            Object value1111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111118);
                            n220.b(qwgVar, dul1Var, 2, value1111118);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key1111119 = entry.getKey();
                            Object value1111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111119);
                            n220.b(qwgVar, dul1Var, 2, value1111119);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key11111110 = entry.getKey();
                            Object value11111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111110);
                            n220.b(qwgVar, dul1Var, 2, value11111110);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key11111111 = entry.getKey();
                            Object value11111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111);
                            n220.b(qwgVar, dul1Var, 2, value11111111);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key11111112 = entry.getKey();
                            Object value11111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111112);
                            n220.b(qwgVar, dul1Var, 2, value11111112);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key11111113 = entry.getKey();
                            Object value11111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111113);
                            n220.b(qwgVar, dul1Var, 2, value11111113);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key11111114 = entry.getKey();
                            Object value11111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111114);
                            n220.b(qwgVar, dul1Var, 2, value11111114);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key11111115 = entry.getKey();
                            Object value11111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111115);
                            n220.b(qwgVar, dul1Var, 2, value11111115);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key11111116 = entry.getKey();
                            Object value11111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111116);
                            n220.b(qwgVar, dul1Var, 2, value11111116);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key11111117 = entry.getKey();
                            Object value11111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111117);
                            n220.b(qwgVar, dul1Var, 2, value11111117);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key11111118 = entry.getKey();
                            Object value11111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111118);
                            n220.b(qwgVar, dul1Var, 2, value11111118);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key11111119 = entry.getKey();
                            Object value11111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111119);
                            n220.b(qwgVar, dul1Var, 2, value11111119);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i7);
                            Object key111111110 = entry.getKey();
                            Object value111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111110);
                            n220.b(qwgVar, dul1Var, 2, value111111110);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i7);
                    Object key111111111 = entry.getKey();
                    Object value111111111 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key111111111);
                    n220.b(qwgVar, dul1Var, 2, value111111111);
                    break;
                case 5:
                    ((Long) key).getClass();
                    iE0 = 8;
                    int i8 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key111111112 = entry.getKey();
                            Object value111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111112);
                            n220.b(qwgVar, dul1Var, 2, value111111112);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key111111113 = entry.getKey();
                            Object value111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111113);
                            n220.b(qwgVar, dul1Var, 2, value111111113);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key111111114 = entry.getKey();
                            Object value111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111114);
                            n220.b(qwgVar, dul1Var, 2, value111111114);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key111111115 = entry.getKey();
                            Object value111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111115);
                            n220.b(qwgVar, dul1Var, 2, value111111115);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key111111116 = entry.getKey();
                            Object value111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111116);
                            n220.b(qwgVar, dul1Var, 2, value111111116);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key111111117 = entry.getKey();
                            Object value111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111117);
                            n220.b(qwgVar, dul1Var, 2, value111111117);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key111111118 = entry.getKey();
                            Object value111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111118);
                            n220.b(qwgVar, dul1Var, 2, value111111118);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key111111119 = entry.getKey();
                            Object value111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111119);
                            n220.b(qwgVar, dul1Var, 2, value111111119);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key1111111110 = entry.getKey();
                            Object value1111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111110);
                            n220.b(qwgVar, dul1Var, 2, value1111111110);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key1111111111 = entry.getKey();
                            Object value1111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111);
                            n220.b(qwgVar, dul1Var, 2, value1111111111);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key1111111112 = entry.getKey();
                            Object value1111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111112);
                            n220.b(qwgVar, dul1Var, 2, value1111111112);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key1111111113 = entry.getKey();
                            Object value1111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111113);
                            n220.b(qwgVar, dul1Var, 2, value1111111113);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key1111111114 = entry.getKey();
                            Object value1111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111114);
                            n220.b(qwgVar, dul1Var, 2, value1111111114);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key1111111115 = entry.getKey();
                            Object value1111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111115);
                            n220.b(qwgVar, dul1Var, 2, value1111111115);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i8);
                            Object key1111111116 = entry.getKey();
                            Object value1111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111116);
                            n220.b(qwgVar, dul1Var, 2, value1111111116);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i8);
                    Object key1111111117 = entry.getKey();
                    Object value1111111117 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key1111111117);
                    n220.b(qwgVar, dul1Var, 2, value1111111117);
                    break;
                case 6:
                    ((Integer) key).getClass();
                    iE0 = 4;
                    int i9 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key1111111118 = entry.getKey();
                            Object value1111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111118);
                            n220.b(qwgVar, dul1Var, 2, value1111111118);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key1111111119 = entry.getKey();
                            Object value1111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111119);
                            n220.b(qwgVar, dul1Var, 2, value1111111119);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key11111111110 = entry.getKey();
                            Object value11111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111110);
                            n220.b(qwgVar, dul1Var, 2, value11111111110);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key11111111111 = entry.getKey();
                            Object value11111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111);
                            n220.b(qwgVar, dul1Var, 2, value11111111111);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key11111111112 = entry.getKey();
                            Object value11111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111112);
                            n220.b(qwgVar, dul1Var, 2, value11111111112);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key11111111113 = entry.getKey();
                            Object value11111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111113);
                            n220.b(qwgVar, dul1Var, 2, value11111111113);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key11111111114 = entry.getKey();
                            Object value11111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111114);
                            n220.b(qwgVar, dul1Var, 2, value11111111114);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key11111111115 = entry.getKey();
                            Object value11111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111115);
                            n220.b(qwgVar, dul1Var, 2, value11111111115);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key11111111116 = entry.getKey();
                            Object value11111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111116);
                            n220.b(qwgVar, dul1Var, 2, value11111111116);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key11111111117 = entry.getKey();
                            Object value11111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111117);
                            n220.b(qwgVar, dul1Var, 2, value11111111117);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key11111111118 = entry.getKey();
                            Object value11111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111118);
                            n220.b(qwgVar, dul1Var, 2, value11111111118);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key11111111119 = entry.getKey();
                            Object value11111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111119);
                            n220.b(qwgVar, dul1Var, 2, value11111111119);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key111111111110 = entry.getKey();
                            Object value111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111110);
                            n220.b(qwgVar, dul1Var, 2, value111111111110);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key111111111111 = entry.getKey();
                            Object value111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111);
                            n220.b(qwgVar, dul1Var, 2, value111111111111);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i9);
                            Object key111111111112 = entry.getKey();
                            Object value111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111112);
                            n220.b(qwgVar, dul1Var, 2, value111111111112);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i9);
                    Object key111111111113 = entry.getKey();
                    Object value111111111113 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key111111111113);
                    n220.b(qwgVar, dul1Var, 2, value111111111113);
                    break;
                case 7:
                    ((Boolean) key).getClass();
                    iE0 = 1;
                    int i10 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key111111111114 = entry.getKey();
                            Object value111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111114);
                            n220.b(qwgVar, dul1Var, 2, value111111111114);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key111111111115 = entry.getKey();
                            Object value111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111115);
                            n220.b(qwgVar, dul1Var, 2, value111111111115);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key111111111116 = entry.getKey();
                            Object value111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111116);
                            n220.b(qwgVar, dul1Var, 2, value111111111116);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key111111111117 = entry.getKey();
                            Object value111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111117);
                            n220.b(qwgVar, dul1Var, 2, value111111111117);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key111111111118 = entry.getKey();
                            Object value111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111118);
                            n220.b(qwgVar, dul1Var, 2, value111111111118);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key111111111119 = entry.getKey();
                            Object value111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111119);
                            n220.b(qwgVar, dul1Var, 2, value111111111119);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key1111111111110 = entry.getKey();
                            Object value1111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111110);
                            n220.b(qwgVar, dul1Var, 2, value1111111111110);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key1111111111111 = entry.getKey();
                            Object value1111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key1111111111112 = entry.getKey();
                            Object value1111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111112);
                            n220.b(qwgVar, dul1Var, 2, value1111111111112);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key1111111111113 = entry.getKey();
                            Object value1111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111113);
                            n220.b(qwgVar, dul1Var, 2, value1111111111113);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key1111111111114 = entry.getKey();
                            Object value1111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111114);
                            n220.b(qwgVar, dul1Var, 2, value1111111111114);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key1111111111115 = entry.getKey();
                            Object value1111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111115);
                            n220.b(qwgVar, dul1Var, 2, value1111111111115);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key1111111111116 = entry.getKey();
                            Object value1111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111116);
                            n220.b(qwgVar, dul1Var, 2, value1111111111116);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key1111111111117 = entry.getKey();
                            Object value1111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111117);
                            n220.b(qwgVar, dul1Var, 2, value1111111111117);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i10);
                            Object key1111111111118 = entry.getKey();
                            Object value1111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111118);
                            n220.b(qwgVar, dul1Var, 2, value1111111111118);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i10);
                    Object key1111111111119 = entry.getKey();
                    Object value1111111111119 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key1111111111119);
                    n220.b(qwgVar, dul1Var, 2, value1111111111119);
                    break;
                case 8:
                    iE0 = key instanceof ihc ? qwg.s0((ihc) key) : qwg.Q0((String) key);
                    int i11 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key11111111111110 = entry.getKey();
                            Object value11111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111110);
                            n220.b(qwgVar, dul1Var, 2, value11111111111110);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key11111111111111 = entry.getKey();
                            Object value11111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key11111111111112 = entry.getKey();
                            Object value11111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111112);
                            n220.b(qwgVar, dul1Var, 2, value11111111111112);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key11111111111113 = entry.getKey();
                            Object value11111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111113);
                            n220.b(qwgVar, dul1Var, 2, value11111111111113);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key11111111111114 = entry.getKey();
                            Object value11111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111114);
                            n220.b(qwgVar, dul1Var, 2, value11111111111114);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key11111111111115 = entry.getKey();
                            Object value11111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111115);
                            n220.b(qwgVar, dul1Var, 2, value11111111111115);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key11111111111116 = entry.getKey();
                            Object value11111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111116);
                            n220.b(qwgVar, dul1Var, 2, value11111111111116);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key11111111111117 = entry.getKey();
                            Object value11111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111117);
                            n220.b(qwgVar, dul1Var, 2, value11111111111117);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key11111111111118 = entry.getKey();
                            Object value11111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111118);
                            n220.b(qwgVar, dul1Var, 2, value11111111111118);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key11111111111119 = entry.getKey();
                            Object value11111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111119);
                            n220.b(qwgVar, dul1Var, 2, value11111111111119);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key111111111111110 = entry.getKey();
                            Object value111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value111111111111110);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key111111111111111 = entry.getKey();
                            Object value111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key111111111111112 = entry.getKey();
                            Object value111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value111111111111112);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key111111111111113 = entry.getKey();
                            Object value111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value111111111111113);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i11);
                            Object key111111111111114 = entry.getKey();
                            Object value111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value111111111111114);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i11);
                    Object key111111111111115 = entry.getKey();
                    Object value111111111111115 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key111111111111115);
                    n220.b(qwgVar, dul1Var, 2, value111111111111115);
                    break;
                case 9:
                    iE0 = qwg.A0((a) key);
                    int i12 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key111111111111116 = entry.getKey();
                            Object value111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value111111111111116);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key111111111111117 = entry.getKey();
                            Object value111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value111111111111117);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key111111111111118 = entry.getKey();
                            Object value111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value111111111111118);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key111111111111119 = entry.getKey();
                            Object value111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value111111111111119);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key1111111111111110 = entry.getKey();
                            Object value1111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111110);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key1111111111111111 = entry.getKey();
                            Object value1111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key1111111111111112 = entry.getKey();
                            Object value1111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111112);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key1111111111111113 = entry.getKey();
                            Object value1111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111113);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key1111111111111114 = entry.getKey();
                            Object value1111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111114);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key1111111111111115 = entry.getKey();
                            Object value1111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111115);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key1111111111111116 = entry.getKey();
                            Object value1111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111116);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key1111111111111117 = entry.getKey();
                            Object value1111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111117);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key1111111111111118 = entry.getKey();
                            Object value1111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111118);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key1111111111111119 = entry.getKey();
                            Object value1111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111119);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i12);
                            Object key11111111111111110 = entry.getKey();
                            Object value11111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111110);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i12);
                    Object key11111111111111111 = entry.getKey();
                    Object value11111111111111111 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key11111111111111111);
                    n220.b(qwgVar, dul1Var, 2, value11111111111111111);
                    break;
                case 10:
                    iE0 = qwg.G0((a) key);
                    int i13 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key11111111111111112 = entry.getKey();
                            Object value11111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111112);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key11111111111111113 = entry.getKey();
                            Object value11111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111113);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key11111111111111114 = entry.getKey();
                            Object value11111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111114);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key11111111111111115 = entry.getKey();
                            Object value11111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111115);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key11111111111111116 = entry.getKey();
                            Object value11111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111116);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key11111111111111117 = entry.getKey();
                            Object value11111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111117);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key11111111111111118 = entry.getKey();
                            Object value11111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111118);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key11111111111111119 = entry.getKey();
                            Object value11111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111119);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key111111111111111110 = entry.getKey();
                            Object value111111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111110);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key111111111111111111 = entry.getKey();
                            Object value111111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key111111111111111112 = entry.getKey();
                            Object value111111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111112);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key111111111111111113 = entry.getKey();
                            Object value111111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111113);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key111111111111111114 = entry.getKey();
                            Object value111111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111114);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key111111111111111115 = entry.getKey();
                            Object value111111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111115);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i13);
                            Object key111111111111111116 = entry.getKey();
                            Object value111111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111116);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i13);
                    Object key111111111111111117 = entry.getKey();
                    Object value111111111111111117 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key111111111111111117);
                    n220.b(qwgVar, dul1Var, 2, value111111111111111117);
                    break;
                case 11:
                    iE0 = key instanceof ihc ? qwg.s0((ihc) key) : qwg.q0((byte[]) key);
                    int i14 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key111111111111111118 = entry.getKey();
                            Object value111111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111118);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key111111111111111119 = entry.getKey();
                            Object value111111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111119);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key1111111111111111110 = entry.getKey();
                            Object value1111111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111110);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key1111111111111111111 = entry.getKey();
                            Object value1111111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key1111111111111111112 = entry.getKey();
                            Object value1111111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111112);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key1111111111111111113 = entry.getKey();
                            Object value1111111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111113);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key1111111111111111114 = entry.getKey();
                            Object value1111111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111114);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key1111111111111111115 = entry.getKey();
                            Object value1111111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111115);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key1111111111111111116 = entry.getKey();
                            Object value1111111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111116);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key1111111111111111117 = entry.getKey();
                            Object value1111111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111117);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key1111111111111111118 = entry.getKey();
                            Object value1111111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111118);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key1111111111111111119 = entry.getKey();
                            Object value1111111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111119);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key11111111111111111110 = entry.getKey();
                            Object value11111111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111110);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key11111111111111111111 = entry.getKey();
                            Object value11111111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i14);
                            Object key11111111111111111112 = entry.getKey();
                            Object value11111111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111112);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i14);
                    Object key11111111111111111113 = entry.getKey();
                    Object value11111111111111111113 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key11111111111111111113);
                    n220.b(qwgVar, dul1Var, 2, value11111111111111111113);
                    break;
                case 12:
                    iE0 = qwg.T0(((Integer) key).intValue());
                    int i15 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key11111111111111111114 = entry.getKey();
                            Object value11111111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111114);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key11111111111111111115 = entry.getKey();
                            Object value11111111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111115);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key11111111111111111116 = entry.getKey();
                            Object value11111111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111116);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key11111111111111111117 = entry.getKey();
                            Object value11111111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111117);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key11111111111111111118 = entry.getKey();
                            Object value11111111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111118);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key11111111111111111119 = entry.getKey();
                            Object value11111111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111119);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key111111111111111111110 = entry.getKey();
                            Object value111111111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111110);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key111111111111111111111 = entry.getKey();
                            Object value111111111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key111111111111111111112 = entry.getKey();
                            Object value111111111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111112);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key111111111111111111113 = entry.getKey();
                            Object value111111111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111113);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key111111111111111111114 = entry.getKey();
                            Object value111111111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111114);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key111111111111111111115 = entry.getKey();
                            Object value111111111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111115);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key111111111111111111116 = entry.getKey();
                            Object value111111111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111116);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key111111111111111111117 = entry.getKey();
                            Object value111111111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111117);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i15);
                            Object key111111111111111111118 = entry.getKey();
                            Object value111111111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111118);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i15);
                    Object key111111111111111111119 = entry.getKey();
                    Object value111111111111111111119 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key111111111111111111119);
                    n220.b(qwgVar, dul1Var, 2, value111111111111111111119);
                    break;
                case 13:
                    iE0 = qwg.v0(((Integer) key).intValue());
                    int i16 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key1111111111111111111110 = entry.getKey();
                            Object value1111111111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111110);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key1111111111111111111111 = entry.getKey();
                            Object value1111111111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key1111111111111111111112 = entry.getKey();
                            Object value1111111111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111112);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key1111111111111111111113 = entry.getKey();
                            Object value1111111111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111113);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key1111111111111111111114 = entry.getKey();
                            Object value1111111111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111114);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key1111111111111111111115 = entry.getKey();
                            Object value1111111111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111115);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key1111111111111111111116 = entry.getKey();
                            Object value1111111111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111116);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key1111111111111111111117 = entry.getKey();
                            Object value1111111111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111117);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key1111111111111111111118 = entry.getKey();
                            Object value1111111111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111118);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key1111111111111111111119 = entry.getKey();
                            Object value1111111111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111119);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key11111111111111111111110 = entry.getKey();
                            Object value11111111111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111110);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key11111111111111111111111 = entry.getKey();
                            Object value11111111111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key11111111111111111111112 = entry.getKey();
                            Object value11111111111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111112);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key11111111111111111111113 = entry.getKey();
                            Object value11111111111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111113);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i16);
                            Object key11111111111111111111114 = entry.getKey();
                            Object value11111111111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111114);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i16);
                    Object key11111111111111111111115 = entry.getKey();
                    Object value11111111111111111111115 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key11111111111111111111115);
                    n220.b(qwgVar, dul1Var, 2, value11111111111111111111115);
                    break;
                case 14:
                    ((Integer) key).getClass();
                    iE0 = 4;
                    int i17 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key11111111111111111111116 = entry.getKey();
                            Object value11111111111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111116);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key11111111111111111111117 = entry.getKey();
                            Object value11111111111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111117);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key11111111111111111111118 = entry.getKey();
                            Object value11111111111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111118);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key11111111111111111111119 = entry.getKey();
                            Object value11111111111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111119);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key111111111111111111111110 = entry.getKey();
                            Object value111111111111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111110);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key111111111111111111111111 = entry.getKey();
                            Object value111111111111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111111);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key111111111111111111111112 = entry.getKey();
                            Object value111111111111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111112);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key111111111111111111111113 = entry.getKey();
                            Object value111111111111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111113);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key111111111111111111111114 = entry.getKey();
                            Object value111111111111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111114);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key111111111111111111111115 = entry.getKey();
                            Object value111111111111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111115);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key111111111111111111111116 = entry.getKey();
                            Object value111111111111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111116);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key111111111111111111111117 = entry.getKey();
                            Object value111111111111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111117);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key111111111111111111111118 = entry.getKey();
                            Object value111111111111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111118);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key111111111111111111111119 = entry.getKey();
                            Object value111111111111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111119);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i17);
                            Object key1111111111111111111111110 = entry.getKey();
                            Object value1111111111111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111110);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i17);
                    Object key1111111111111111111111111 = entry.getKey();
                    Object value1111111111111111111111111 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111111);
                    n220.b(qwgVar, dul1Var, 2, value1111111111111111111111111);
                    break;
                case 15:
                    ((Long) key).getClass();
                    iE0 = 8;
                    int i18 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key1111111111111111111111112 = entry.getKey();
                            Object value1111111111111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111112);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key1111111111111111111111113 = entry.getKey();
                            Object value1111111111111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111113);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key1111111111111111111111114 = entry.getKey();
                            Object value1111111111111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111114);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key1111111111111111111111115 = entry.getKey();
                            Object value1111111111111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111115);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key1111111111111111111111116 = entry.getKey();
                            Object value1111111111111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111116);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key1111111111111111111111117 = entry.getKey();
                            Object value1111111111111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111117);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key1111111111111111111111118 = entry.getKey();
                            Object value1111111111111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111118);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key1111111111111111111111119 = entry.getKey();
                            Object value1111111111111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111119);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key11111111111111111111111110 = entry.getKey();
                            Object value11111111111111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111110);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key11111111111111111111111111 = entry.getKey();
                            Object value11111111111111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111111);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key11111111111111111111111112 = entry.getKey();
                            Object value11111111111111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111112);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key11111111111111111111111113 = entry.getKey();
                            Object value11111111111111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111113);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key11111111111111111111111114 = entry.getKey();
                            Object value11111111111111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111114);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key11111111111111111111111115 = entry.getKey();
                            Object value11111111111111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111115);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i18);
                            Object key11111111111111111111111116 = entry.getKey();
                            Object value11111111111111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111116);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i18);
                    Object key11111111111111111111111117 = entry.getKey();
                    Object value11111111111111111111111117 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111117);
                    n220.b(qwgVar, dul1Var, 2, value11111111111111111111111117);
                    break;
                case 16:
                    iE0 = qwg.M0(((Integer) key).intValue());
                    int i19 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key11111111111111111111111118 = entry.getKey();
                            Object value11111111111111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111118);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key11111111111111111111111119 = entry.getKey();
                            Object value11111111111111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111119);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key111111111111111111111111110 = entry.getKey();
                            Object value111111111111111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111111110);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key111111111111111111111111111 = entry.getKey();
                            Object value111111111111111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111111111);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key111111111111111111111111112 = entry.getKey();
                            Object value111111111111111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111111112);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key111111111111111111111111113 = entry.getKey();
                            Object value111111111111111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111111113);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key111111111111111111111111114 = entry.getKey();
                            Object value111111111111111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111111114);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key111111111111111111111111115 = entry.getKey();
                            Object value111111111111111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111111115);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key111111111111111111111111116 = entry.getKey();
                            Object value111111111111111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111111116);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key111111111111111111111111117 = entry.getKey();
                            Object value111111111111111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111111117);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key111111111111111111111111118 = entry.getKey();
                            Object value111111111111111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111111118);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key111111111111111111111111119 = entry.getKey();
                            Object value111111111111111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key111111111111111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value111111111111111111111111119);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key1111111111111111111111111110 = entry.getKey();
                            Object value1111111111111111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111111110);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key1111111111111111111111111111 = entry.getKey();
                            Object value1111111111111111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111111111);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i19);
                            Object key1111111111111111111111111112 = entry.getKey();
                            Object value1111111111111111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111111112);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i19);
                    Object key1111111111111111111111111113 = entry.getKey();
                    Object value1111111111111111111111111113 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111111113);
                    n220.b(qwgVar, dul1Var, 2, value1111111111111111111111111113);
                    break;
                case 17:
                    iE0 = qwg.O0(((Long) key).longValue());
                    int i110 = iE0 + iR1;
                    iR0 = qwg.R0(2);
                    if (dul1Var == dul1Var3) {
                        iR0 *= 2;
                    }
                    switch (dul1Var.ordinal()) {
                        case 0:
                            ((Double) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key1111111111111111111111111114 = entry.getKey();
                            Object value1111111111111111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111111114);
                            break;
                        case 1:
                            ((Float) value).getClass();
                            break;
                        case 2:
                            iE1 = qwg.E0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key1111111111111111111111111115 = entry.getKey();
                            Object value1111111111111111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111111115);
                            break;
                        case 3:
                            iE1 = qwg.V0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key1111111111111111111111111116 = entry.getKey();
                            Object value1111111111111111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111111116);
                            break;
                        case 4:
                            iE1 = qwg.C0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key1111111111111111111111111117 = entry.getKey();
                            Object value1111111111111111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111111117);
                            break;
                        case 5:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key1111111111111111111111111118 = entry.getKey();
                            Object value1111111111111111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111111118);
                            break;
                        case 6:
                            ((Integer) value).getClass();
                            break;
                        case 7:
                            ((Boolean) value).getClass();
                            iE1 = 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key1111111111111111111111111119 = entry.getKey();
                            Object value1111111111111111111111111119 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key1111111111111111111111111119);
                            n220.b(qwgVar, dul1Var, 2, value1111111111111111111111111119);
                            break;
                        case 8:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.Q0((String) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key11111111111111111111111111110 = entry.getKey();
                            Object value11111111111111111111111111110 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111111110);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111111110);
                            break;
                        case 9:
                            iE1 = qwg.A0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key11111111111111111111111111111 = entry.getKey();
                            Object value11111111111111111111111111111 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111111111);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111111111);
                            break;
                        case 10:
                            iE1 = qwg.G0((a) value);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key11111111111111111111111111112 = entry.getKey();
                            Object value11111111111111111111111111112 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111111112);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111111112);
                            break;
                        case 11:
                            if (value instanceof ihc) {
                                iE1 = qwg.s0((ihc) value);
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                                continue;
                            } else {
                                iE1 = qwg.q0((byte[]) value);
                            }
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key11111111111111111111111111113 = entry.getKey();
                            Object value11111111111111111111111111113 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111111113);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111111113);
                            break;
                        case 12:
                            iE1 = qwg.T0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key11111111111111111111111111114 = entry.getKey();
                            Object value11111111111111111111111111114 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111111114);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111111114);
                            break;
                        case 13:
                            iE1 = qwg.v0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key11111111111111111111111111115 = entry.getKey();
                            Object value11111111111111111111111111115 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111111115);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111111115);
                            break;
                        case 14:
                            ((Integer) value).getClass();
                            break;
                        case 15:
                            ((Long) value).getClass();
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key11111111111111111111111111116 = entry.getKey();
                            Object value11111111111111111111111111116 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111111116);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111111116);
                            break;
                        case 16:
                            iE1 = qwg.M0(((Integer) value).intValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key11111111111111111111111111117 = entry.getKey();
                            Object value11111111111111111111111111117 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111111117);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111111117);
                            break;
                        case 17:
                            iE1 = qwg.O0(((Long) value).longValue());
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            qwgVar.r1(iE1 + iR0 + i110);
                            Object key11111111111111111111111111118 = entry.getKey();
                            Object value11111111111111111111111111118 = entry.getValue();
                            n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111111118);
                            n220.b(qwgVar, dul1Var, 2, value11111111111111111111111111118);
                            break;
                        default:
                            jah.g("There is no way to get here, but the compiler thinks otherwise.");
                            break;
                    }
                    iE1 = 4;
                    qwgVar.r1(iE1 + iR0 + i110);
                    Object key11111111111111111111111111119 = entry.getKey();
                    Object value11111111111111111111111111119 = entry.getValue();
                    n220.b(qwgVar, dul1Var2, 1, key11111111111111111111111111119);
                    n220.b(qwgVar, dul1Var, 2, value11111111111111111111111111119);
                    break;
                default:
                    jah.g("There is no way to get here, but the compiler thinks otherwise.");
                    break;
            }
            return;
        }
    }

    public void P(int i, Object obj, tm41 tm41Var) {
        qwg qwgVar = (qwg) this.b;
        a aVar = (a) obj;
        qwgVar.p1(i, 2);
        qwgVar.r1(aVar.b(tm41Var));
        tm41Var.f(aVar, qwgVar.k);
    }

    public void Q(int i, List list, tm41 tm41Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            P(i, list.get(i2), tm41Var);
        }
    }

    public void R(int i, int i2) {
        ((qwg) this.b).e1(i, i2);
    }

    public void S(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qwgVar.e1(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        qwgVar.r1(i3);
        while (i2 < list.size()) {
            qwgVar.f1(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void T(int i, long j) {
        ((qwg) this.b).g1(i, j);
    }

    public void U(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qwgVar.g1(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        qwgVar.r1(i3);
        while (i2 < list.size()) {
            qwgVar.h1(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void V(int i, int i2) {
        ((qwg) this.b).q1(i, (i2 >> 31) ^ (i2 << 1));
    }

    public void W(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                qwgVar.q1(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int iM0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM0 += qwg.M0(((Integer) list.get(i3)).intValue());
        }
        qwgVar.r1(iM0);
        while (i2 < list.size()) {
            qwgVar.l1(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void X(int i, long j) {
        ((qwg) this.b).s1(i, (j >> 63) ^ (j << 1));
    }

    public void Y(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                qwgVar.s1(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int iO0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO0 += qwg.O0(((Long) list.get(i3)).longValue());
        }
        qwgVar.r1(iO0);
        while (i2 < list.size()) {
            qwgVar.m1(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public void Z(int i) {
        ((qwg) this.b).p1(i, 3);
    }

    public int a() {
        return 16000;
    }

    public void a0(int i, String str) {
        ((qwg) this.b).n1(i, str);
    }

    public boolean accept(Object obj) {
        oum oumVar = (oum) this.b;
        return oumVar.b && !oumVar.a().isEmpty();
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x610 x610Var = ((kc9) obj2).k;
                if (zBooleanValue) {
                    return x610Var.c().i(-15000L, j5.a);
                }
                g710 g710VarC = x610Var.c();
                g710VarC.getClass();
                return g710VarC.k.a(new o9u0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).doOnSuccess(new b710(g710VarC, (byte) 1));
            case 5:
                return ((y0b) ((t4d1) obj2).b).c().onErrorReturnItem(new wc90()).toObservable();
            case 6:
                j8x0 j8x0Var = (j8x0) obj;
                return j8x0.a(j8x0Var, 0, o7h.N0(j8x0Var.b, ((j8x0) obj2).b), j8x0Var.c, false, j8x0Var.e, 0, 0, 105);
            case 12:
                Map map = ((kvd) obj2).d;
                map.putAll((Map) obj);
                return map;
            case 15:
                return new k7g(((s6g) obj2).c.b, (GetCheckoutPageResponse) obj);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                v0h v0hVar = (v0h) obj;
                z0h z0hVar = (z0h) obj2;
                String strF = z0hVar.a.F();
                if (strF == null) {
                    return CompletableEmpty.a;
                }
                tv80 tv80Var = v0hVar.a;
                return j2h1.D(o6x.a, new us0(v0hVar, z0hVar, strF, tv80Var != null ? new ubc0(tv80Var) : null, (lnm) null, (byte) 19, false));
            case 20:
                return u9c.t((IsCuratedResponse) obj, ((d7h) obj2).b, (Map) null);
            default:
                uv00 uv00Var = (uv00) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj2).iterator();
                while (it.hasNext()) {
                    zvh zvhVar = uv00Var.a(zvh.class, (String) it.next()).b;
                    if (zvhVar != null) {
                        arrayList.add(zvhVar);
                    }
                }
                return arrayList;
        }
    }

    public Object b() {
        return Integer.valueOf(((dhb) ((kly0) this.b).get()).m());
    }

    public void b0(int i, List list) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!(list instanceof pvb0)) {
            while (i2 < list.size()) {
                qwgVar.n1(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        pvb0 pvb0Var = (pvb0) list;
        while (i2 < list.size()) {
            Object objJ = pvb0Var.j(i2);
            if (objJ instanceof String) {
                qwgVar.n1(i, (String) objJ);
            } else {
                qwgVar.b1(i, (ihc) objJ);
            }
            i2++;
        }
    }

    public void c(int i) {
        gah gahVar = ((ww9) this.b).d;
        if (gahVar != null) {
            gahVar.a(i);
        }
    }

    public void c0(int i, int i2) {
        ((qwg) this.b).q1(i, i2);
    }

    public void d(tv80 tv80Var) {
        ((ejm) this.b).a.a.invoke(tv80Var);
    }

    public void d0(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qwgVar.q1(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int iT0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iT0 += qwg.T0(((Integer) list.get(i3)).intValue());
        }
        qwgVar.r1(iT0);
        while (i2 < list.size()) {
            qwgVar.r1(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public void e(String str) {
        Consumer consumer = ((jbn) this.b).t;
        if (consumer != null) {
            consumer.accept(new zan(str));
        }
    }

    public void e0(int i, long j) {
        ((qwg) this.b).s1(i, j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(String str, lnm lnmVar) {
        v8m v8mVar;
        if (lnmVar instanceof v8m) {
            v8mVar = (v8m) lnmVar;
            int i = v8mVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v8mVar.c = i - Integer.MIN_VALUE;
            } else {
                v8mVar = new v8m(this, (onm) lnmVar);
            }
        } else {
            v8mVar = new v8m(this, (onm) lnmVar);
        }
        Object objJ = v8mVar.a;
        int i2 = v8mVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            e4c1 e4c1Var = (e4c1) this.b;
            u461 u461VarN = SendStoryFeedbackRequest.n();
            u461VarN.r(str);
            u461VarN.q(w461.c);
            Single map = e4c1Var.a(u461VarN.build()).map(new fza(this, (byte) 3));
            v8mVar.c = 1;
            objJ = fc11.j(map, v8mVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    public void f0(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qwgVar.s1(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int iV0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iV0 += qwg.V0(((Long) list.get(i3)).longValue());
        }
        qwgVar.r1(iV0);
        while (i2 < list.size()) {
            qwgVar.t1(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public boolean g() {
        ((SearchView) ((jbn) this.b).a.e).clearFocus();
        return true;
    }

    public Object get() {
        return new DispatcherWorker(((lie) this.b).e);
    }

    public t28 h(int i, int i2) {
        return (xuc) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(String str, lnm lnmVar) {
        t8m t8mVar;
        if (lnmVar instanceof t8m) {
            t8mVar = (t8m) lnmVar;
            int i = t8mVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t8mVar.c = i - Integer.MIN_VALUE;
            } else {
                t8mVar = new t8m(this, (onm) lnmVar);
            }
        } else {
            t8mVar = new t8m(this, (onm) lnmVar);
        }
        Object objJ = t8mVar.a;
        int i2 = t8mVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            e4c1 e4c1Var = (e4c1) this.b;
            u461 u461VarN = SendStoryFeedbackRequest.n();
            u461VarN.r(str);
            u461VarN.q(w461.b);
            Single map = e4c1Var.a(u461VarN.build()).map(new twa(this));
            t8mVar.c = 1;
            objJ = fc11.j(map, t8mVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(o5o0 o5o0Var, lnm lnmVar) {
        u8m u8mVar;
        v461 v461Var;
        if (lnmVar instanceof u8m) {
            u8mVar = (u8m) lnmVar;
            int i = u8mVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u8mVar.c = i - Integer.MIN_VALUE;
            } else {
                u8mVar = new u8m(this, (onm) lnmVar);
            }
        } else {
            u8mVar = new u8m(this, (onm) lnmVar);
        }
        Object objJ = u8mVar.a;
        int i2 = u8mVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            e4c1 e4c1Var = (e4c1) this.b;
            u461 u461VarN = SendStoryFeedbackRequest.n();
            u461VarN.r(o5o0Var.a);
            u461VarN.q(w461.d);
            n5o0 n5o0Var = o5o0Var.c;
            int i3 = n5o0Var == null ? -1 : s8m.a[n5o0Var.ordinal()];
            if (i3 == 1) {
                v461Var = v461.c;
            } else if (i3 == 2) {
                v461Var = v461.d;
            } else if (i3 == 3) {
                v461Var = v461.e;
            } else if (i3 != 4) {
                v461Var = i3 != 5 ? v461.b : v461.f;
            } else {
                v461Var = v461.g;
            }
            u461VarN.n(v461Var);
            String str = o5o0Var.b;
            if (str == null) {
                str = "";
            }
            u461VarN.s(str);
            Single map = e4c1Var.a(u461VarN.build()).map(new jxa(this, (byte) 3));
            u8mVar.c = 1;
            objJ = fc11.j(map, u8mVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    public Single l(Intent intent, th61 th61Var) {
        return Single.just(((jrn0) this.b).l(intent, th61Var));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0184  */
    /* JADX WARN: Code duplicated, block: B:140:0x0238  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:173:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[LOOP:2: B:99:0x017e->B:186:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x0165  */
    /* JADX WARN: Code duplicated, block: B:95:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x017a  */
    public Serializable n(String str, onm onmVar) {
        z7f z7fVar;
        r7f s7fVar;
        x7f x7fVar;
        v7f v7fVar;
        int i;
        int i2;
        int i3;
        h290 h290VarQ;
        Iterator it;
        if (onmVar instanceof z7f) {
            z7fVar = (z7f) onmVar;
            int i4 = z7fVar.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z7fVar.c = i4 - Integer.MIN_VALUE;
            } else {
                z7fVar = new z7f(this, onmVar);
            }
        } else {
            z7fVar = new z7f(this, onmVar);
        }
        Object objA = z7fVar.a;
        int i5 = z7fVar.c;
        if (i5 == 0) {
            hm5.M(objA);
            rn40 rn40VarN = GetInsightsRequest.n();
            rn40VarN.n(str);
            GetInsightsRequest getInsightsRequestBuild = rn40VarN.build();
            y7f y7fVar = (y7f) this.b;
            getInsightsRequestBuild.getClass();
            z7fVar.c = 1;
            objA = y7fVar.a(getInsightsRequestBuild, z7fVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i5 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        List<InsightItem> itemsList = ((GetInsightsResponse) objA).getItemsList();
        ArrayList arrayList = new ArrayList();
        for (InsightItem insightItem : itemsList) {
            insightItem.getClass();
            if (ihc1.y0(insightItem.getId())) {
                hhg1.n("Insight ID must not be blank");
                return null;
            }
            int iN = insightItem.n();
            int i6 = iN == 0 ? -1 : a8f.a[l1d.C(iN)];
            if (i6 != -1) {
                int i7 = 3;
                int i8 = 0;
                if (i6 == 1) {
                    SpotlightContent spotlightContentQ = insightItem.q();
                    int iOrdinal = spotlightContentQ.p().ordinal();
                    if (iOrdinal == 0) {
                        i = 0;
                    } else if (iOrdinal == 1) {
                        i = 1;
                    } else if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            eg.o();
                            return null;
                        }
                        i = 0;
                    } else {
                        i = 2;
                    }
                    if (i == 0) {
                        s7fVar = null;
                    } else {
                        if (ihc1.y0(spotlightContentQ.getUsername())) {
                            hhg1.n("Spotlight username must not be blank");
                            return null;
                        }
                        if (ihc1.y0(spotlightContentQ.getEntityUri())) {
                            hhg1.n("Spotlight entity URI must not be blank");
                            return null;
                        }
                        h290 h290VarQ2 = spotlightContentQ.q();
                        if (!h290VarQ2.isEmpty()) {
                            Iterator it2 = h290VarQ2.iterator();
                            while (it2.hasNext()) {
                                if (ihc1.y0((String) it2.next())) {
                                    hhg1.n("Spotlight participant usernames must not be blank");
                                    return null;
                                }
                            }
                        }
                        s7fVar = new s7f(spotlightContentQ.getUsername(), spotlightContentQ.q(), spotlightContentQ.getEntityUri(), i, ((long) spotlightContentQ.o()) & 4294967295L);
                    }
                } else if (i6 != 2) {
                    if (i6 == 3) {
                        EntityMatchContent entityMatchContentO = insightItem.o();
                        int iOrdinal2 = entityMatchContentO.o().ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                i8 = 1;
                            } else if (iOrdinal2 == 2) {
                                i8 = 2;
                            } else if (iOrdinal2 != 3) {
                                eg.o();
                                return null;
                            }
                        }
                        if (i8 != 0) {
                            if (entityMatchContentO.p().size() >= 2) {
                                h290 h290VarP = entityMatchContentO.p();
                                if (!h290VarP.isEmpty()) {
                                    Iterator it3 = h290VarP.iterator();
                                    while (it3.hasNext()) {
                                        if (!ihc1.y0((String) it3.next())) {
                                        }
                                    }
                                }
                                if (ihc1.y0(entityMatchContentO.getEntityUri())) {
                                    hhg1.n("Entity Match URI must not be blank");
                                    return null;
                                }
                                s7fVar = new r7f(i8, entityMatchContentO.getEntityUri(), entityMatchContentO.p());
                            }
                            hhg1.n("Entity Match must contain at least two nonblank usernames");
                            return null;
                        }
                    } else if (i6 != 4) {
                        eg.o();
                        return null;
                    }
                    s7fVar = null;
                } else {
                    TasteMatchContent tasteMatchContentP = insightItem.p();
                    int iOrdinal3 = tasteMatchContentP.p().ordinal();
                    if (iOrdinal3 == 0) {
                        i2 = 0;
                    } else if (iOrdinal3 == 1) {
                        i2 = 1;
                    } else if (iOrdinal3 == 2) {
                        i2 = 2;
                    } else if (iOrdinal3 != 3) {
                        if (iOrdinal3 != 4) {
                            eg.o();
                            return null;
                        }
                        i2 = 0;
                    } else {
                        i2 = 3;
                    }
                    if (i2 == 0) {
                        s7fVar = null;
                    } else {
                        switch (tasteMatchContentP.o().ordinal()) {
                            case 0:
                            case 6:
                                i3 = 0;
                                if (i3 == 0) {
                                    if (tasteMatchContentP.q().size() >= 2) {
                                        h290VarQ = tasteMatchContentP.q();
                                        if (!h290VarQ.isEmpty()) {
                                            it = h290VarQ.iterator();
                                            while (it.hasNext()) {
                                                if (!ihc1.y0((String) it.next())) {
                                                }
                                            }
                                        }
                                        s7fVar = new t7f(tasteMatchContentP.q(), yoi1.r(((long) tasteMatchContentP.getMatchPercentage()) & 4294967295L, 0L, 100L), i2, i3);
                                        break;
                                    }
                                    hhg1.n("Taste Match must contain at least two nonblank usernames");
                                    return null;
                                }
                                s7fVar = null;
                                break;
                                break;
                            case 1:
                                i3 = 1;
                                if (i3 == 0) {
                                    if (tasteMatchContentP.q().size() >= 2) {
                                        h290VarQ = tasteMatchContentP.q();
                                        if (!h290VarQ.isEmpty()) {
                                            it = h290VarQ.iterator();
                                            while (it.hasNext()) {
                                                if (!ihc1.y0((String) it.next())) {
                                                }
                                            }
                                        }
                                        s7fVar = new t7f(tasteMatchContentP.q(), yoi1.r(((long) tasteMatchContentP.getMatchPercentage()) & 4294967295L, 0L, 100L), i2, i3);
                                        break;
                                    }
                                    hhg1.n("Taste Match must contain at least two nonblank usernames");
                                    return null;
                                }
                                s7fVar = null;
                                break;
                                break;
                            case 2:
                                i3 = 2;
                                if (i3 == 0) {
                                    if (tasteMatchContentP.q().size() >= 2) {
                                        h290VarQ = tasteMatchContentP.q();
                                        if (!h290VarQ.isEmpty()) {
                                            it = h290VarQ.iterator();
                                            while (it.hasNext()) {
                                                if (!ihc1.y0((String) it.next())) {
                                                }
                                            }
                                        }
                                        s7fVar = new t7f(tasteMatchContentP.q(), yoi1.r(((long) tasteMatchContentP.getMatchPercentage()) & 4294967295L, 0L, 100L), i2, i3);
                                        break;
                                    }
                                    hhg1.n("Taste Match must contain at least two nonblank usernames");
                                    return null;
                                }
                                s7fVar = null;
                                break;
                                break;
                            case 3:
                                i3 = i7;
                                if (i3 == 0) {
                                    if (tasteMatchContentP.q().size() >= 2) {
                                        h290VarQ = tasteMatchContentP.q();
                                        if (!h290VarQ.isEmpty()) {
                                            it = h290VarQ.iterator();
                                            while (it.hasNext()) {
                                                if (!ihc1.y0((String) it.next())) {
                                                }
                                            }
                                        }
                                        s7fVar = new t7f(tasteMatchContentP.q(), yoi1.r(((long) tasteMatchContentP.getMatchPercentage()) & 4294967295L, 0L, 100L), i2, i3);
                                        break;
                                    }
                                    hhg1.n("Taste Match must contain at least two nonblank usernames");
                                    return null;
                                }
                                s7fVar = null;
                                break;
                                break;
                            case 4:
                                i3 = 4;
                                if (i3 == 0) {
                                    if (tasteMatchContentP.q().size() >= 2) {
                                        h290VarQ = tasteMatchContentP.q();
                                        if (!h290VarQ.isEmpty()) {
                                            it = h290VarQ.iterator();
                                            while (it.hasNext()) {
                                                if (!ihc1.y0((String) it.next())) {
                                                }
                                            }
                                        }
                                        s7fVar = new t7f(tasteMatchContentP.q(), yoi1.r(((long) tasteMatchContentP.getMatchPercentage()) & 4294967295L, 0L, 100L), i2, i3);
                                        break;
                                    }
                                    hhg1.n("Taste Match must contain at least two nonblank usernames");
                                    return null;
                                }
                                s7fVar = null;
                                break;
                                break;
                            case 5:
                                i7 = 5;
                                i3 = i7;
                                if (i3 == 0) {
                                    if (tasteMatchContentP.q().size() >= 2) {
                                        h290VarQ = tasteMatchContentP.q();
                                        if (!h290VarQ.isEmpty()) {
                                            it = h290VarQ.iterator();
                                            while (it.hasNext()) {
                                                if (!ihc1.y0((String) it.next())) {
                                                }
                                            }
                                        }
                                        s7fVar = new t7f(tasteMatchContentP.q(), yoi1.r(((long) tasteMatchContentP.getMatchPercentage()) & 4294967295L, 0L, 100L), i2, i3);
                                        break;
                                    }
                                    hhg1.n("Taste Match must contain at least two nonblank usernames");
                                    return null;
                                }
                                s7fVar = null;
                                break;
                                break;
                            default:
                                eg.o();
                                return null;
                        }
                    }
                }
            } else {
                s7fVar = null;
            }
            if (s7fVar == null) {
                x7fVar = null;
            } else {
                String id = insightItem.getId();
                if (insightItem.hasTimeRange()) {
                    Interval timeRange = insightItem.getTimeRange();
                    if (timeRange.r() && timeRange.q()) {
                        Timestamp timestampO = timeRange.o();
                        Timestamp timestampP = timeRange.p();
                        if (timestampO.q() < timestampP.q() || (timestampO.q() == timestampP.q() && timestampO.p() < timestampP.p())) {
                            v7fVar = null;
                        } else {
                            Timestamp timestampP2 = timeRange.p();
                            w7f w7fVar = new w7f(timestampP2.q(), timestampP2.p());
                            Timestamp timestampO2 = timeRange.o();
                            v7fVar = new v7f(w7fVar, new w7f(timestampO2.q(), timestampO2.p()));
                        }
                    } else {
                        v7fVar = null;
                    }
                } else {
                    v7fVar = null;
                }
                x7fVar = new x7f(id, v7fVar, s7fVar);
            }
            if (x7fVar != null) {
                arrayList.add(x7fVar);
            }
        }
        return arrayList;
    }

    public g020 o(sy21 sy21Var) {
        rih1 m231Var;
        ry21 ry21Var = sy21Var.a;
        int i = ry21Var.d;
        e020 e020Var = e020.a;
        if (i == 304) {
            return e020Var;
        }
        ResolveResponse resolveResponse = (ResolveResponse) sy21Var.b;
        boolean z = ry21Var.Q0;
        c020 c020Var = c020.a;
        if (!z || resolveResponse == null || !resolveResponse.p()) {
            return c020Var;
        }
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.o("response: " + resolveResponse, new Object[0]);
        Configuration configurationO = resolveResponse.o();
        String strC = ry21Var.f.c("etag");
        if (strC == null) {
            strC = "";
        }
        String str = strC;
        String strP = configurationO.p();
        if (strP == null || ihc1.y0(strP)) {
            utw0Var.y("RCS");
            utw0Var.A("Issue when handling Remote config data: invalid data from RCR", new Object[0]);
        } else {
            try {
                h290<Configuration.AssignedValue> h290VarO = configurationO.o();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                for (Configuration.AssignedValue assignedValue : h290VarO) {
                    assignedValue.getClass();
                    arrayList.add(l67.b(assignedValue));
                }
                String strP2 = configurationO.p();
                long jR = configurationO.r();
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                long jS = configurationO.s();
                ne neVar = (ne) this.b;
                svz0 svz0Var = svz0.d;
                ((cj4) neVar.d).f(ulc.m(new sc50(jR, jS, strP2, str, listUnmodifiableList)));
                sz11 sz11Var = (sz11) neVar.b;
                if (sz11Var != null) {
                    sz11Var.b(mgo1.j(((hm61) neVar.a).a));
                }
                m231Var = rih1.a;
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            Throwable thA = e331.a(m231Var);
            if (thA != null) {
                utw0 utw0Var2 = ike1.a;
                utw0Var2.y("RCS");
                utw0Var2.B(thA, "Issue when handling Remote config data", new Object[0]);
            }
        }
        return (resolveResponse.p() && resolveResponse.o().isInitialized()) ? e020Var : c020Var;
    }

    public void p(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((kda) this.b).b(0);
    }

    public void q(fhr0 fhr0Var) {
        ((gzj) this.b).b.remove(fhr0Var);
    }

    public void r(String str, String str2, tv80 tv80Var, nk51 nk51Var) {
        uny unyVar = (uny) this.b;
        fn31.T(smo1.e((q8n) unyVar.d), (o8n) null, 0, new ary((byte) 0, unyVar, new lik1(str2), str, new wqy((String) null, true, true, true, true, true, false, false, (p860) null, (ugo0) null, (c821) null, (String) null, nk51Var, false, 12225), tv80Var, (lnm) null), 3);
    }

    public void t(int i, boolean z) {
        ((qwg) this.b).a1(i, z);
    }

    public void u(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                qwgVar.a1(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        qwgVar.r1(i3);
        while (i2 < list.size()) {
            qwgVar.Y0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public void v(int i, ihc ihcVar) {
        ((qwg) this.b).b1(i, ihcVar);
    }

    public void w(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((qwg) this.b).b1(i, (ihc) list.get(i2));
        }
    }

    public void x(double d, int i) {
        qwg qwgVar = (qwg) this.b;
        qwgVar.getClass();
        qwgVar.g1(i, Double.doubleToRawLongBits(d));
    }

    public void y(int i, List list, boolean z) {
        qwg qwgVar = (qwg) this.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                qwgVar.getClass();
                qwgVar.g1(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        qwgVar.p1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        qwgVar.r1(i3);
        while (i2 < list.size()) {
            qwgVar.d1(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public void z(int i) {
        ((qwg) this.b).p1(i, 4);
    }

    public jc9(u9c u9cVar, d7h d7hVar) {
        this.a = (byte) 20;
        this.b = d7hVar;
    }

    public /* synthetic */ jc9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((CacheState) obj) != CacheState.LOADING && (((gmc) this.b).g instanceof fh80 ? true : ((Boolean) obj2).booleanValue()));
    }

    public void apply(long j) {
        noa.X((noa) this.b, 4, Long.valueOf(j), 4);
    }
}
