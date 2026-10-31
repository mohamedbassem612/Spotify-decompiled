package p;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.mobius.Next;
import com.spotify.personalizedepisodes.contentservice.v1.Answer;
import com.spotify.personalizedepisodes.contentservice.v1.PersonalizePresetResponse;
import com.spotify.personalizedepisodes.contentservice.v1.Preset;
import com.spotify.personalizedepisodes.contentservice.v1.PresetStep;
import com.spotify.personalizedepisodes.contentservice.v1.RecommendedTool;
import com.spotify.personalizedepisodes.contentservice.v1.Schedule;
import com.spotify.personalizedepisodes.contentservice.v1.ShowItem;
import com.spotify.personalizedepisodes.contentservice.v1.Topic;
import com.spotify.personalizedepisodes.contentservice.v1.Voice;
import com.spotify.transcript.list.TranscriptListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class d1u {
    public static final j2i a = new j2i(229953281, new dh((byte) 5), false);
    public static final j2i b = new j2i(1937363690, new dh((byte) 6), false);
    public static b180 c;
    public static b180 d;

    public static final void A(agq agqVar, float f, uia uiaVar, float f2, int i, int i2, ijf1 ijf1Var, float f3, float f4, int i3, boolean z, float f5, float f6, jel1 jel1Var, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, pmg1 pmg1Var, qim0 qim0Var, zge1 zge1Var, Function0 function0, boolean z2, boolean z3, int i4, int i5, Integer num, float f7, Integer num2, List list, b0k b0kVar, int i6, int i7, int i8) {
        int i9;
        ijf1 ijf1Var2;
        qim0 qim0Var2;
        List list2;
        int size;
        int size2;
        float f8;
        float f9;
        float f10;
        boolean z4;
        int i10;
        Object obj = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1836160074);
        int i11 = i6 | (b0kVar2.i(agqVar) ? 4 : 2) | (b0kVar2.d(f) ? 32 : 16) | (b0kVar2.i(uiaVar) ? 256 : 128) | (b0kVar2.d(f2) ? 2048 : 1024) | (b0kVar2.e(i) ? 16384 : 8192) | (b0kVar2.e(i2) ? 131072 : 65536) | (b0kVar2.d(f3) ? 8388608 : 4194304) | (b0kVar2.d(f4) ? 67108864 : 33554432) | (b0kVar2.e(i3) ? 536870912 : 268435456);
        int i12 = 0 | (b0kVar2.h(z) ? (char) 4 : (char) 2) | (b0kVar2.d(f5) ? 32 : 16) | (b0kVar2.d(f6) ? 256 : 128) | (b0kVar2.i(jel1Var) ? 2048 : 1024) | (b0kVar2.i(vu30Var) ? 16384 : 8192) | (b0kVar2.i(iu30Var2) ? 1048576 : 524288) | (b0kVar2.g(pmg1Var) ? 8388608 : 4194304) | 100663296 | (b0kVar2.i(zge1Var) ? (char) 0 : (char) 0);
        int i13 = i7 | (b0kVar2.i(function0) ? 4 : 2) | (b0kVar2.h(z2) ? 32 : 16) | (b0kVar2.h(z3) ? 256 : 128) | (b0kVar2.e(i4) ? 2048 : 1024) | (b0kVar2.e(i5) ? 16384 : 8192);
        if ((i7 & 196608) == 0) {
            i13 |= b0kVar2.g(num) ? 131072 : 65536;
        }
        int i14 = i13 | (b0kVar2.d(f7) ? 1048576 : 524288) | (b0kVar2.g(num2) ? 8388608 : 4194304);
        int i15 = i8 & 268435456;
        if (i15 != 0) {
            i9 = i14 | 100663296;
        } else {
            i9 = i14 | (b0kVar2.i(list) ? 67108864 : 33554432);
        }
        int i16 = i9;
        if (b0kVar2.Y(i11 & 1, ((i11 & 306783379) == 306783378 && (i12 & 306783379) == 306783378 && (i16 & 38347923) == 38347922) ? false : true)) {
            List list3 = i15 != 0 ? z6x.a : list;
            tob1 tob1VarC = z95.c(i3, irn1.o0(300, 0, mlv.a, 2), "transitionDurationAnimation", (iu30) null, b0kVar2, ((i11 >> 27) & 14) | 384, 8);
            if (zge1Var != null) {
                size = zge1Var.c.size();
                int iO = k1u.o(f7, i2);
                if (iO > 1) {
                    size = ((size + iO) - 1) / iO;
                }
            } else {
                size = jel1Var != null ? jel1Var.a.size() : 0;
            }
            if (zge1Var != null) {
                size2 = zge1Var.c.size() * zge1Var.b;
            } else {
                size2 = jel1Var != null ? jel1Var.a.size() * 100 : 0;
            }
            if (size > 0) {
                f8 = 0.0f;
                f9 = size2 / size;
            } else {
                f8 = 0.0f;
                f9 = 0.0f;
            }
            boolean zE = ((i16 & 3670016) == 1048576) | b0kVar2.e(((Number) tob1VarC.getValue()).intValue()) | b0kVar2.d(f9) | ((i11 & 112) == 32);
            Object objT = b0kVar2.T();
            if (zE || objT == obj) {
                if (f9 != f8 && ((Number) tob1VarC.getValue()).intValue() > 0) {
                    float fIntValue = (f5 / ((Number) tob1VarC.getValue()).intValue()) * f9;
                    int iOrdinal = ijf1Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            eg.o();
                            return;
                        }
                        fIntValue = (Math.abs(f) > Float.MAX_VALUE || f == f8) ? f8 : fIntValue / f;
                    }
                    f10 = fIntValue * f7;
                } else {
                    f10 = f8;
                }
                objT = Float.valueOf(f10);
                b0kVar2.s0(objT);
            }
            float fFloatValue = ((Number) objT).floatValue();
            boolean zE2 = b0kVar2.e(size) | ((i11 & 7168) == 2048) | b0kVar2.d(fFloatValue) | b0kVar2.d(f9) | ((i12 & 896) == 256);
            int i17 = 29360128 & i12;
            boolean z5 = zE2 | (i17 == 8388608);
            Object objT2 = b0kVar2.T();
            if (z5 || objT2 == obj) {
                float f11 = fFloatValue * f2;
                float f12 = f6 / 2.0f;
                float f13 = 0.8f * f12 * f2;
                float f14 = pmg1Var.h;
                float f15 = (size * f11) - f14;
                float f16 = pmg1Var.b;
                float f17 = f15 - f16;
                float f18 = f11 > f8 ? ((pmg1Var.g + f14) + f14) / f11 : f8;
                objT2 = new lel1(pmg1Var.a, f9, f18 * fFloatValue, f12, -f14, f17, f11, f16, f13, f14, f18);
                b0kVar2.s0(objT2);
            }
            lel1 lel1Var = (lel1) objT2;
            int iOrdinal2 = ijf1Var.ordinal();
            if (iOrdinal2 != 0) {
                z4 = true;
                if (iOrdinal2 != 1) {
                    eg.o();
                    return;
                }
                i10 = 1;
            } else {
                z4 = true;
                i10 = 2;
            }
            jti0 jti0Var = new jti0(ijf1Var, z2, z3, i4, i5, num, num2, vu30Var, iu30Var, iu30Var2, function0);
            boolean z6 = i17 == 8388608 ? z4 : false;
            if ((i12 & 14) != 4) {
                z4 = false;
            }
            boolean zG = z6 | z4 | b0kVar2.g(lel1Var);
            Object objT3 = b0kVar2.T();
            if (zG || objT3 == obj) {
                ijf1Var2 = ijf1Var;
                vdl1 vdl1Var = new vdl1((yqg) agqVar.a.b.J1.get(), new hij1(ijf1Var2, pmg1Var, (byte) 24), new svh0(z, lel1Var, (byte) 23));
                b0kVar2.s0(vdl1Var);
                objT3 = vdl1Var;
            } else {
                ijf1Var2 = ijf1Var;
            }
            udl1 udl1Var = new udl1(uiaVar, i2, f3, jel1Var, i, lel1Var, jti0Var, i10, zge1Var, f4, f7, list3, pmg1Var.e);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar2;
            otw.c((vdl1) objT3, udl1Var, qim0Var3, (ipb1) null, b0kVar2, 448, 8);
            list2 = list3;
            qim0Var2 = qim0Var3;
        } else {
            ijf1Var2 = ijf1Var;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            list2 = list;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bel1(agqVar, f, uiaVar, f2, i, i2, ijf1Var2, f3, f4, i3, z, f5, f6, jel1Var, vu30Var, iu30Var, iu30Var2, pmg1Var, qim0Var2, zge1Var, function0, z2, z3, i4, i5, num, f7, num2, list2, i6, i7, i8);
        }
    }

    public static final void C(View view) {
        TranscriptListView transcriptListViewFindViewById = view.findViewById(2131431507);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new eg7(transcriptListViewFindViewById, (byte) 22));
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int marginEnd = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0;
        if (marginStart == 0 && marginEnd == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
        view.setLayoutParams(marginLayoutParams);
        transcriptListViewFindViewById.getClass();
        ViewGroup.LayoutParams layoutParams4 = transcriptListViewFindViewById.getLayoutParams();
        if (layoutParams4 == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams2.setMargins(marginStart, marginLayoutParams2.topMargin, marginEnd, marginLayoutParams2.bottomMargin);
        transcriptListViewFindViewById.setLayoutParams(marginLayoutParams2);
    }

    public static final Object D(jf01 jf01Var, onm onmVar) {
        ohd ohdVar = new ohd(1, aym.t(onmVar));
        ohdVar.t();
        ohdVar.n(new b1u(jf01Var, (byte) 0));
        jf01Var.d(new c1u(ohdVar));
        return ohdVar.r();
    }

    public static final qim0 E(float f, long j, qim0 qim0Var, hw61 hw61Var) {
        return F(qim0Var, f, new n6a1(j), hw61Var);
    }

    public static final qim0 F(qim0 qim0Var, float f, Brush brush, hw61 hw61Var) {
        return qim0Var.then(new pqb(f, brush, hw61Var));
    }

    public static final b180 G() {
        b180 b180Var = d;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.VideoVerticalActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(20.121f, 1.879f);
        cwh0VarG.b(3.0f, 3.0f, false, true, 21.0f, 4.0f);
        cwh0VarG.v(16.0f);
        cwh0VarG.c(3.0f, 3.0f, false, true, -3.0f, 3.0f);
        cwh0VarG.h(6.0f);
        cwh0VarG.c(3.0f, 3.0f, false, true, -3.0f, -3.0f);
        cwh0VarG.u(4.0f);
        cwh0VarG.c(3.0f, 3.0f, false, true, 3.0f, -3.0f);
        cwh0VarG.i(12.0f);
        cwh0VarG.c(3.0f, 3.0f, false, true, 2.121f, 0.879f);
        cwh0VarG.l(10.0f, 9.0f);
        cwh0VarG.v(6.0f);
        cwh0VarG.k(5.196f, -3.0f);
        cwh0VarG.e();
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        d = b180VarB;
        return b180VarB;
    }

    public static final long H(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final d9w0 I(PersonalizePresetResponse personalizePresetResponse) {
        x681 y681Var;
        if (!personalizePresetResponse.q()) {
            eg.m("Check failed.");
            return null;
        }
        e9w0 e9w0VarJ = J(personalizePresetResponse.o());
        String strN = personalizePresetResponse.n();
        h290<ShowItem> h290VarP = personalizePresetResponse.p();
        ArrayList arrayList = new ArrayList();
        for (ShowItem showItem : h290VarP) {
            showItem.getClass();
            int iN = showItem.n();
            int i = iN == 0 ? -1 : b9w0.b[l1d.C(iN)];
            if (i == 1) {
                y681Var = new y681(showItem.p().o());
            } else if (i != 2) {
                y681Var = null;
            } else {
                y681Var = new x681(showItem.o().getId(), showItem.o().p(), showItem.o().getTitle(), showItem.o().o());
            }
            if (y681Var != null) {
                arrayList.add(y681Var);
            }
        }
        return new d9w0(e9w0VarJ, strN, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:112:0x02dd  */
    public static final e9w0 J(Preset preset) {
        String str;
        n7r n7rVar;
        n7r xk41Var;
        zlk1 zlk1Var;
        r591 r591Var;
        r591 r591Var2;
        String strP;
        String strN;
        String str2;
        j9w0 f9w0Var;
        int i;
        int i2;
        n7r n7rVar2;
        String id = preset.getId();
        String title = preset.getTitle();
        String strV = preset.v();
        String description = preset.getDescription();
        String strO = preset.o();
        if (strO.length() == 0) {
            n7rVar = null;
            str = null;
        } else {
            str = strO;
            n7rVar = null;
        }
        String strR = preset.r();
        int i3 = 1;
        int i4 = 4;
        int i5 = 3;
        int i6 = 2;
        if (preset.x()) {
            Schedule scheduleT = preset.t();
            int iOrdinal = scheduleT.q().ordinal();
            if (iOrdinal == 2) {
                i2 = 2;
            } else if (iOrdinal != 3) {
                i2 = iOrdinal != 4 ? 1 : 4;
            } else {
                i2 = 3;
            }
            m7r m7rVar = (m7r) o7h.s0(scheduleT.o());
            n7r n7rVar3 = n7r.a;
            if (m7rVar != null) {
                switch (m7rVar.ordinal()) {
                    case 2:
                        n7rVar2 = n7r.b;
                        break;
                    case 3:
                        n7rVar2 = n7r.c;
                        break;
                    case 4:
                        n7rVar2 = n7r.d;
                        break;
                    case 5:
                        n7rVar2 = n7r.e;
                        break;
                    case 6:
                        n7rVar2 = n7r.f;
                        break;
                    case 7:
                        n7rVar2 = n7r.g;
                        break;
                    default:
                        n7rVar2 = n7rVar3;
                        break;
                }
            } else {
                n7rVar2 = n7rVar;
            }
            if (n7rVar2 != null) {
                n7rVar3 = n7rVar2;
            } else if (i2 != 3) {
                n7rVar3 = n7rVar;
            }
            xk41Var = new xk41(i2, n7rVar3);
        } else {
            xk41Var = n7rVar;
        }
        if (preset.y()) {
            Voice voiceW = preset.w();
            zlk1Var = new zlk1(voiceW.getId(), voiceW.getName(), voiceW.getDescription(), voiceW.o());
        } else {
            zlk1Var = null;
        }
        h290 h290VarU = preset.u();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarU, 10));
        Iterator it = h290VarU.iterator();
        while (it.hasNext()) {
            PresetStep presetStep = (PresetStep) it.next();
            presetStep.getClass();
            int iP = presetStep.p();
            int i7 = iP == 0 ? -1 : b9w0.a[l1d.C(iP)];
            if (i7 == i3) {
                f9w0Var = new f9w0(presetStep.getTitle(), presetStep.getDescription(), presetStep.r());
            } else if (i7 == i6) {
                String title2 = presetStep.getTitle();
                String description2 = presetStep.getDescription();
                String name = presetStep.q().getName();
                String description3 = presetStep.q().getDescription();
                h290<Topic> h290VarN = presetStep.q().n();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
                for (Topic topic : h290VarN) {
                    topic.getClass();
                    arrayList2.add(new l9w0(topic.getName(), topic.hasDescription() ? topic.getDescription() : null, topic.n()));
                }
                f9w0Var = new i9w0(title2, description2, name, description3, arrayList2, presetStep.r());
            } else if (i7 == i5) {
                String title3 = presetStep.getTitle();
                String description4 = presetStep.getDescription();
                h290<RecommendedTool> h290VarO = presetStep.o().o();
                ArrayList arrayList3 = new ArrayList(q7h.U(h290VarO, 10));
                for (RecommendedTool recommendedTool : h290VarO) {
                    recommendedTool.getClass();
                    arrayList3.add(new e311(recommendedTool.getId(), recommendedTool.q(), recommendedTool.getName(), recommendedTool.p(), recommendedTool.n(), recommendedTool.o()));
                }
                f9w0Var = new h9w0(title3, description4, arrayList3, presetStep.r());
            } else if (i7 != i4) {
                f9w0Var = new j9w0(presetStep.getTitle(), presetStep.getDescription(), presetStep.r());
            } else {
                String title4 = presetStep.getTitle();
                String description5 = presetStep.getDescription();
                String id2 = presetStep.n().getId();
                Integer numValueOf = presetStep.n().s() ? Integer.valueOf(presetStep.n().q()) : null;
                boolean zN = presetStep.n().n();
                h290<Answer> h290VarO2 = presetStep.n().o();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarO2, 10));
                for (Answer answer : h290VarO2) {
                    answer.getClass();
                    String id3 = answer.getId();
                    String strP2 = answer.p();
                    String description6 = answer.hasDescription() ? answer.getDescription() : null;
                    int iOrdinal2 = answer.n().ordinal();
                    if (iOrdinal2 == i3) {
                        i = 2;
                    } else if (iOrdinal2 != 2) {
                        i = iOrdinal2 != 3 ? 1 : 4;
                    } else {
                        i = 3;
                    }
                    arrayList4.add(new c9w0(i, id3, strP2, answer.o(), description6));
                    i3 = 1;
                }
                f9w0Var = new g9w0(title4, description5, id2, numValueOf, zN, arrayList4, presetStep.n().t() ? presetStep.n().r() : null, presetStep.r());
            }
            arrayList.add(f9w0Var);
            it = it;
            i3 = 1;
            i4 = 4;
            i5 = 3;
            i6 = 2;
        }
        int iOrdinal3 = preset.s().ordinal();
        if (iOrdinal3 != 1) {
            if (iOrdinal3 != 2) {
                r591Var2 = null;
            } else {
                r591Var = r591.b;
            }
            String prompt = preset.getPrompt();
            strP = preset.p();
            if (strP.length() == 0) {
                strP = null;
            }
            strN = preset.n();
            if (strN.length() == 0) {
                str2 = null;
            } else {
                str2 = strN;
            }
            return new e9w0(id, title, strV, description, str, strR, xk41Var, zlk1Var, arrayList, r591Var2, prompt, strP, str2);
        }
        r591Var = r591.c;
        r591Var2 = r591Var;
        String prompt2 = preset.getPrompt();
        strP = preset.p();
        if (strP.length() == 0) {
            strP = null;
        }
        strN = preset.n();
        if (strN.length() == 0) {
            str2 = null;
        } else {
            str2 = strN;
        }
        return new e9w0(id, title, strV, description, str, strR, xk41Var, zlk1Var, arrayList, r591Var2, prompt2, strP, str2);
    }

    public static Next K(kak0 kak0Var, i3k0 i3k0Var) {
        boolean zP = i2p1.p(kak0Var);
        k1k0 k1k0Var = i0k0.a;
        if (!zP) {
            return Next.a(Collections.singleton(k1k0Var));
        }
        int iC = l1d.C(i3k0Var.a);
        if (iC == 0) {
            return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, giq0.c, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -1, 1048574), f46.S0(new k1k0[]{k1k0Var, q3p1.m(kak0Var, new v0k0(i3k0Var.b))}));
        }
        if (iC == 1) {
            return Next.a(Collections.singleton(k1k0Var));
        }
        eg.o();
        return null;
    }

    public static final void a(String str, ArrayList arrayList, String str2, Function0 function0, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-67788264);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(arrayList) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | (b0kVar3.i(iu30Var) ? 16384 : 8192) | 196608 | (b0kVar3.i(iu30Var2) ? 1048576 : 524288);
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
            ven0 ven0VarS2 = v8r.s(iu30Var2, b0kVar3);
            ven0 ven0VarS3 = v8r.s(context, b0kVar3);
            boolean zG = b0kVar3.g(arrayList);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                ye5 ye5Var = new ye5();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    qqc1 qqc1Var = (sqc1) it.next();
                    if (qqc1Var instanceof rqc1) {
                        ye5Var.g(((rqc1) qqc1Var).a);
                    } else if (!(qqc1Var instanceof qqc1)) {
                        eg.o();
                        return;
                    } else {
                        qqc1 qqc1Var2 = qqc1Var;
                        vhg.b(ye5Var, qqc1Var2.a, qqc1Var2.b, new db(ven0VarS, qqc1Var2, ven0VarS2, ven0VarS3, (byte) 7));
                    }
                }
                objT = ye5Var.p();
                b0kVar3.s0(objT);
            }
            af5 af5Var = (af5) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(b0kVar3).a.a.a(), d4o1.a);
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF2);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar3).g, 32, qim0VarB);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarP);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            uwo1.e(str, (qim0) null, cbx.d(b0kVar3).e, cbx.a(b0kVar3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, i2 & 14, 0, 2018);
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            uwo1.d(af5Var, cbx.a(b0kVar3).b.b, (qim0) null, kk0.p(qim0Var3, 8.0f, b0kVar3, b0kVar3).j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar3, 0, 0, 4068);
            op71.g(b0kVar3, u291.h(qim0Var3, cbx.b(b0kVar3).b.a));
            idx idxVar = new idx(4);
            gdx gdxVarR = yla.r(b0kVar3);
            boolean z = (i2 & 7168) == 2048;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new lj2(function0, (byte) 2);
                b0kVar3.s0(objT2);
            }
            foo1.c(new gbx(z50.c, (Function0) objT2), idxVar, (qim0) null, (max) null, gdxVarR, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-852340029, new nl(str2, (byte) 17), b0kVar3), b0kVar3, 0, 48, 2012);
            b0kVar2 = b0kVar3;
            x0d.s(qim0Var3, cbx.b(b0kVar2).b.c, b0kVar2, true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(str, arrayList, str2, function0, iu30Var, qim0Var2, iu30Var2, i);
        }
    }

    public static final void b(uy30 uy30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(156076211);
        int i2 = i | (x340Var.g(uy30Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0.a);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str = uy30Var.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).c, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
            if (uy30Var.b.length() > 0) {
                x340Var.i0(142929384);
                uwo1.e(uy30Var.b, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                x340Var.r(false);
            } else {
                x340Var.i0(143074681);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new boj(uy30Var, i, (byte) 19);
        }
    }

    public static final void c(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1177129054);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        byte b2 = 18;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            function2 = function1;
            mqo1.e(function2, (i3u) null, (vu30) null, lji.b, lji.c, apo.r(1249218144, new bvk(function1, (byte) 23), x340Var), apo.r(1951152737, new bvk(function0, (byte) 24), x340Var), x340Var, ((i2 >> 3) & 14) | 1797120, 6);
        } else {
            function2 = function1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function2, i, b2);
        }
    }

    public static final void d(int i, b0k b0kVar, iu30 iu30Var, ic40 ic40Var) {
        jax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-584419614);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | (x340Var.i(ic40Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gra graVar = een.h;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new bb30(iu30Var, (byte) 16);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            idx idxVar = new idx(13);
            if (ic40Var.j) {
                x340Var.i0(-682222064);
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                x340Var.i0(-682171410);
                haxVar = new hax(cwl1.o0(x340Var, 2131956169));
                x340Var.r(false);
            }
            foo1.c(gbxVar, idxVar, (qim0) null, haxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, gqi.c, x340Var, 0, 48, 2028);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ac40(iu30Var, ic40Var, i);
        }
    }

    public static final void e(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(540828903);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new bb30(iu30Var, (byte) 17);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, gqi.a, x340Var, 0, 6, 1020);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 12, i, iu30Var, false);
        }
    }

    public static final void f(int i, b0k b0kVar, iu30 iu30Var, ic40 ic40Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-81773796);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(ic40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            boolean zI = x340Var.i(ic40Var) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new zf10(ic40Var, iu30Var, (byte) 23);
                x340Var.s0(objT);
            }
            ujo1.d(qim0VarX, (xtb0) null, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 510);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(ic40Var, iu30Var, i, (byte) 17);
        }
    }

    public static final void g(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1094932227);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gra graVar = een.h;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new bb30(iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(13), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, gqi.d, x340Var, 0, 48, 2044);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 13, i, iu30Var, false);
        }
    }

    public static final void h(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1117451500);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = uyn1.x(nim0Var, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            i(x340Var, 0);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 16.0f));
            g(iu30Var, x340Var, i2 & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 14, i, iu30Var, false);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1288368902);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131956171);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, u291.f(nim0.a, 1.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 7);
        }
    }

    public static final void j(int i, r8b r8bVar, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1743123916);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.g(r8bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            fra fraVar = een.N0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = t840.Y0;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
            t8b t8bVar = r8bVar.b;
            boolean z = t8bVar.d;
            pm31 pm31Var = new pm31(2);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new gu2(i, r8bVar, iu30Var, (byte) 20);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarD = qmo1.D(qim0VarB, z, false, pm31Var, (iu30) objT2, 10);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarD);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            k(t8bVar.a, b0kVar3, 0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            op71.g(b0kVar3, u291.r(nim0Var, 12.0f));
            l(t8bVar, new wnb0(1.0f, true), b0kVar3, 0);
            b0kVar2 = b0kVar3;
            m(i, (i3 << 3) & 7280, r8bVar.a, b0kVar2, iu30Var, t8bVar.d);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(i, r8bVar, iu30Var, i2, (byte) 7);
        }
    }

    public static final void k(s8b s8bVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-505066570);
        int i2 = (x340Var.g(s8bVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            bmq0.a(Uri.parse(s8bVar.a), (qim0) null, hcx.c, s8bVar.b, (String) null, 0L, 0L, false, x340Var, 384, 242);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rr10(s8bVar, i, (byte) 24);
        }
    }

    public static final void l(t8b t8bVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1766577543);
        int i2 = (x340Var.g(t8bVar) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str = t8bVar.b;
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            String str2 = t8bVar.c;
            if (str2 == null) {
                x340Var.i0(-932072627);
                x340Var.r(false);
            } else {
                x340Var.i0(-932072626);
                uwo1.e(str2, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00(t8bVar, qim0Var, i, (byte) 22);
        }
    }

    public static final void m(int i, int i2, String str, b0k b0kVar, iu30 iu30Var, boolean z) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(259912371);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = t840.Z0;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(nim0.a, (iu30) objT);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new bc40(i, str, iu30Var);
                x340Var.s0(objT2);
            }
            anm1.c(z, (iu30) objT2, qim0VarA, (max) null, (idn0) null, x340Var, i3 & 14, 24);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cc40(i, i2, str, iu30Var, z);
        }
    }

    public static final void n(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-907739032);
        if (x340Var.Y(i & 1, i != 0)) {
            gra graVar = een.h;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.x(nim0Var, 16.0f), 1.0f);
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            xto1.e(h2c.a.a(nim0Var, graVar), 6, 0L, 0L, x340Var, 48, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 8);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void o(k1u k1uVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1113650301);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(k1uVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i3 = (i2 >> 3) & 14;
            r(iu30Var, x340Var, i3);
            if (k1uVar instanceof ic40) {
                x340Var.i0(-1282627562);
                f(i2 & 126, x340Var, iu30Var, (ic40) k1uVar);
                x340Var.r(false);
            } else if (k1uVar instanceof jc40) {
                x340Var.i0(-1282519496);
                h(iu30Var, x340Var, i3);
                x340Var.r(false);
            } else {
                if (!(k1uVar instanceof kc40)) {
                    throw p3d1.k(x340Var, -1426850084, false);
                }
                x340Var.i0(-1282411709);
                n(x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(k1uVar, iu30Var, i, (byte) 18);
        }
    }

    public static final void p(int i, b0k b0kVar, iu30 iu30Var, ic40 ic40Var) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1867050289);
        int i2 = (b0kVar3.i(ic40Var) ? 4 : 2) | i | (b0kVar3.i(iu30Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
            String strO0 = cwl1.o0(b0kVar3, 2131956165);
            String str = ic40Var.g;
            String str2 = ic40Var.k;
            uwr uwrVar = cbx.a;
            FontFamily fontFamily = cbx.d(b0kVar3).j.a.f;
            boolean zG = b0kVar3.g(str) | b0kVar3.g(strO0) | b0kVar3.g(str2) | b0kVar3.g(fontFamily);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                String strSubstring = str.substring(0, ihc1.w0(str, strO0, 0, false, 6));
                String strSubstring2 = str.substring(strO0.length() + strSubstring.length(), str.length());
                ye5 ye5Var = new ye5();
                ye5Var.g(strSubstring);
                vhg.c(ye5Var, strO0, str2, new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61407), new i030(ven0VarS, (byte) 7));
                ye5Var.g(strSubstring2);
                objT = ye5Var.p();
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            uwo1.d((af5) objT, cbx.a(b0kVar3).b.b, (qim0) null, cbx.d(b0kVar3).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 4084);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ac40(ic40Var, iu30Var, i);
        }
    }

    public static final void q(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2139229855);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131956166);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            float f = ((hux) fux.c).a.b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarF = u291.f(uyn1.y(nim0.a, f + 16.0f, 12.0f), 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = t840.a1;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0VarF, false, (iu30) objT), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 9);
        }
    }

    public static final void r(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1088434558);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            e(iu30Var, x340Var, i2 & 14);
            q(x340Var, 0);
            x340Var.r(true);
            rqo1.g(0, 0, x340Var, u291.f(nim0Var, 1.0f));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 15, i, iu30Var, false);
        }
    }

    public static final void s(String str, boolean z, qim0 qim0Var, unb0 unb0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-940591476);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.e(unb0Var == null ? -1 : unb0Var.ordinal()) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = (i2 >> 6) & 14;
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT;
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT5;
            who1.h(s161.b(qim0Var, false, new tu(ufh0Var, (byte) 21)), apo.i(x340Var, -1488813576, new uu(ven0Var2, xhlVar, i3, new su(ven0Var, nilVar, (byte) 17), str, z, unb0Var, function0)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 17), x340Var, 48);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(str, z, qim0Var, unb0Var, function0, i);
        }
    }

    public static final void t(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var;
        int i2;
        int i3;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1615672534);
        int i4 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i4 & 1, (i4 & 147) != 146)) {
            mbh mbhVarA = jbh.a(new d36(10.0f, true, new um5(false)), een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            cr31 cr31VarB = er31.b(4.0f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(anm1.N((str == null || str.length() == 0) ? "snooze_recommendation_header_placeholder_artwork" : "snooze_recommendation_header_artwork", i1p1.q(nim0Var, cr31VarB)), 48.0f);
            Uri uri = (str == null || str.length() == 0) ? Uri.EMPTY : Uri.parse(str);
            uri.getClass();
            eso1.e(uri, isl.a, qim0VarR, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4088);
            if (z) {
                i2 = -204006655;
                i3 = 2131954007;
            } else {
                i2 = -203892916;
                i3 = 2131954006;
            }
            String strK = x0d.k(x340Var2, i2, i3, x340Var2, false);
            uwr uwrVar = cbx.a;
            uwo1.e(strK, anm1.N("snooze_recommendation_header_title", nim0Var), cbx.d(x340Var2).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ltj(str, z, qim0Var, i, (byte) 6);
        }
    }

    public static final void u(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        iu30 iu30Var2;
        qim0 qim0Var2;
        iu30 iu30Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1459424952);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarP, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = o390.Y;
                x340Var.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarF2, false, (iu30) objT);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            uwo1.e(cwl1.o0(x340Var, 2131956797), uyn1.A(qim0VarB2, 16.0f, 16.0f, 16.0f, 12.0f), cbx.d(x340Var).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            String strO0 = cwl1.o0(x340Var, 2131956793);
            String strO1 = cwl1.o0(x340Var, 2131956792);
            j2i j2iVar = kti.a;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                iu30Var3 = iu30Var;
                objT2 = new zi80(iu30Var3, (byte) 15);
                x340Var.s0(objT2);
            } else {
                iu30Var3 = iu30Var;
            }
            x(384, strO0, strO1, (Function0) objT2, j2iVar, x340Var);
            String strO2 = cwl1.o0(x340Var, 2131956795);
            String strO3 = cwl1.o0(x340Var, 2131956794);
            j2i j2iVar2 = kti.b;
            boolean z2 = i3 == 4;
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new zi80(iu30Var3, (byte) 16);
                x340Var.s0(objT3);
            }
            x(384, strO2, strO3, (Function0) objT3, j2iVar2, x340Var);
            qim0Var2 = qim0Var3;
            qim0 qim0VarF3 = u291.f(qim0Var2, 1.0f);
            cvx cvxVar6 = cbx.b(x340Var).b;
            cvx cvxVar7 = cbx.b(x340Var).b;
            cvx cvxVar8 = cbx.b(x340Var).b;
            iu30Var2 = iu30Var;
            uwo1.e(cwl1.o0(x340Var, 2131956796), uyn1.B(qim0VarF3, 16.0f, 16.0f, 16.0f, 0.0f, 8), cbx.d(x340Var).m, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l52(iu30Var2, qim0Var2, i, (byte) 5);
        }
    }

    public static final void v(e9f0 e9f0Var, iu30 iu30Var, jtl1 jtl1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        ud50 ud50Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-281093676);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(e9f0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(jtl1Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            ivb1 ivb1Var = e9f0Var.b;
            r260 r260Var = new r260(cwl1.o0(b0kVar3, 2131957753));
            td50 td50Var = new td50(ivb1Var.c);
            int iC = l1d.C(ivb1Var.d);
            if (iC == 0) {
                ud50Var = vd50.f;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                ud50Var = ud50.f;
            }
            wd50 wd50Var = new wd50(td50Var, ud50Var);
            String strO0 = cwl1.o0(b0kVar3, ivb1Var.a);
            String strO1 = cwl1.o0(b0kVar3, ivb1Var.b);
            String strO2 = cwl1.o0(b0kVar3, ivb1Var.e);
            cm10 cm10Var = new cm10(cwl1.o0(b0kVar3, 2131957741), ssx.c);
            agr0 agr0Var = new agr0(e9f0Var.a, e9f0Var.c.size());
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new ijd0(iu30Var, (byte) 27);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i4 == 32;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ijd0(iu30Var, (byte) 28);
                b0kVar3.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean z3 = i4 == 32;
            Object objT3 = b0kVar3.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new ijd0(iu30Var, (byte) 29);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            l6o1.n(wd50Var, strO0, strO2, cm10Var, function0, function1, (Function0) objT3, jtl1Var, r260Var, true, strO1, agr0Var, b0kVar2, ((i3 << 15) & 29360128) | 4096 | ((i3 << 18) & 1879048192), 6, 0);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, (Object) e9f0Var, (Object) iu30Var, (Object) jtl1Var, (Object) qim0Var2, (byte) 20);
        }
    }

    public static final void w(zyi0 zyi0Var, bzi0 bzi0Var, b0k b0kVar, int i) {
        zyi0 zyi0Var2;
        bzi0 bzi0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(747672930);
        int i2 = (x340Var.g(zyi0Var) ? 4 : 2) | i | (x340Var.i(bzi0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            zyi0Var2 = zyi0Var;
            bzi0Var2 = bzi0Var;
            otw.c(bzi0Var2, zyi0Var2, (qim0) null, (ipb1) null, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 12);
        } else {
            zyi0Var2 = zyi0Var;
            bzi0Var2 = bzi0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new him0(zyi0Var2, bzi0Var2, i, (byte) 0);
        }
    }

    public static final void x(int i, String str, String str2, Function0 function0, j2i j2iVar, b0k b0kVar) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1100519073);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.i(function0) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0VarH = uyn1.h(1, 0.0f, 12.0f);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, new uvx(1, (pgx) null, 3, zzq0VarH, uyn1.h(2, 16.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 482), (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, function0), (gbx) null, (xu30) null, apo.r(-393851384, new rv71(j2iVar, (byte) 17), b0kVar3), (xu30) null, apo.r(769017127, new z3y(str2, (byte) 16), b0kVar3), kti.c, (xu30) null, (xu30) null, apo.r(-177454173, new z3y(str, (byte) 17), b0kVar3), b0kVar2, 805306432, 197040, 26044);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new be90(str, str2, j2iVar, function0, i, (byte) 0);
        }
    }

    public static final void y(float f, int i, int i2, int i3, b0k b0kVar, wi90 wi90Var, qim0 qim0Var, boolean z, boolean z2) {
        wi90 wi90Var2 = wi90Var;
        yj41 yj41Var = wi90Var2.b;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-224789047);
        j06 j06Var = ((x340) b0kVar2).a;
        int i4 = i3 | (b0kVar2.i(wi90Var2) ? 4 : 2) | (b0kVar2.e(i) ? 32 : 16) | (b0kVar2.h(z) ? 256 : 128) | (b0kVar2.e(i2) ? 2048 : 1024) | (b0kVar2.d(f) ? 16384 : 8192) | (b0kVar2.h(z2) ? 131072 : 65536) | (b0kVar2.g(qim0Var) ? 1048576 : 524288);
        if (b0kVar2.Y(i4 & 1, (599187 & i4) != 599186)) {
            String strC = f4i1.c(i, "Top-five-item-");
            ilv.a.getClass();
            int i5 = i4 >> 3;
            j06 j06Var2 = j06Var;
            ven0 ven0VarR = zod.R(new hsi1(strC, Float.valueOf(1.0f), Float.valueOf(0.0f), new pxg1(666, (i + 1) * 83, flv.b), rno1.a), z, (Function0) null, b0kVar2, 8 | (i5 & 112), 4);
            float f2 = (!z2 || ((Number) ven0VarR.getValue()).floatValue() < 1.0f) ? 1.0f : 0.0f;
            float fM0 = ((wat) b0kVar2.k(t4k.h)).M0(i2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            fra fraVar = een.N0;
            b0kVar2.i0(-1273875172);
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v7f1.i;
                b0kVar2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var, true, (iu30) objT);
            nim0 nim0Var = nim0.a;
            if (z2) {
                boolean zG = b0kVar2.g(ven0VarR);
                Object objT2 = b0kVar2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new ctd1(ven0VarR, (byte) 16);
                    b0kVar2.s0(objT2);
                }
                qim0 qim0VarB2 = eqr0.B(nim0Var, (iu30) objT2);
                boolean zD = b0kVar2.d(f2);
                Object objT3 = b0kVar2.T();
                if (zD || objT3 == m4cVar) {
                    objT3 = new vbk0((byte) 28, f2);
                    b0kVar2.s0(objT3);
                }
                qim0VarB = qim0VarB.then(i541.C(qim0VarB2, (iu30) objT3));
            } else {
                j06Var2 = j06Var2;
            }
            b0kVar2.r(false);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, b0kVar2, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
            hzj.A.getClass();
            if (j06Var2 == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z3 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qgo1.f(omo1.q((vnr0) wi90Var2.a.invoke(b0kVar2, 0), cbx.d(b0kVar2).c, cbx.d(b0kVar2).b, b0kVar2), u291.v(nim0Var, fM0), (a0e1) null, 1, false, (iu30) null, b0kVar2, 3080, 52);
            yk4 yk4Var = new yk4(yj41Var.a);
            cbx.a.getClass();
            eso1.f(yk4Var, isl.a, v8r.j(nim0Var, yj41Var.c), new p3v(f), (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, b0kVar2, (i5 & 7168) | 24624, 448);
            b0kVar2 = b0kVar2;
            qim0 qim0VarH = u291.h(nim0Var, f);
            mbh mbhVarA = jbh.a(h36.e, een.P0, b0kVar2, 6);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarH);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            wi90Var2 = wi90Var;
            qgo1.f(omo1.q((vnr0) wi90Var2.c.invoke(b0kVar2, 0), lee1.a(cbx.d(b0kVar2).k, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var2.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), lee1.a(cbx.d(b0kVar2).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var2.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), b0kVar2), (qim0) null, new a0e1(5), 2, false, (iu30) null, b0kVar2, 3080, 50);
            vnr0 vnr0Var = (vnr0) wi90Var2.d.invoke(b0kVar2, 0);
            if (vnr0Var == null || ihc1.y0(vnr0Var.a)) {
                vnr0Var = null;
            }
            if (vnr0Var == null) {
                b0kVar2.i0(1303313490);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1303313491);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                qgo1.f(omo1.q(vnr0Var, lee1.a(kk0.p(nim0Var, 4.0f, b0kVar2, b0kVar2).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var2.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), lee1.a(cbx.d(b0kVar2).g, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var2.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), b0kVar2), (qim0) null, new a0e1(5), 2, false, (iu30) null, b0kVar2, 3080, 50);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r9f1(wi90Var2, i, z, i2, f, z2, qim0Var, i3);
        }
    }

    public static final void z(unb0 unb0Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1592877368);
        int i2 = i | (x340Var.e(unb0Var.ordinal()) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("snooze_recommendation_header_undo", bin.x(u291.x(48.0f, 0.0f, 2, u291.j(48.0f, 0.0f, 2, qim0Var)), false, cwl1.o0(x340Var, 2131954008), new pm31(0), (idn0) null, function0, 9));
            gfh0 gfh0VarC = t1c.c(sw91.a[unb0Var.ordinal()] == 1 ? een.h : een.f, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            uwr uwrVar = cbx.a;
            uwo1.e(cwl1.o0(x340Var, 2131954009), uyn1.B(nim0.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), cbx.d(x340Var).k, cbx.a(x340Var).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(unb0Var, qim0Var, function0, i, (byte) 11);
        }
    }
}
