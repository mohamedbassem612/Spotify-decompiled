package p;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.metadatarow.MetadataRow;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.encoreconsumermobile.elements.thumb.ThumbButtonView;
import com.spotify.encoremobile.component.icons.IconExclamationCircle;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wc3 implements isw {
    public final /* synthetic */ byte a;
    public final Object b;

    public wc3(Context context, ViewGroup viewGroup, qdv0 qdv0Var, iu30 iu30Var) {
        bs0 bs0Var;
        this.a = (byte) 13;
        tka0 tka0Var = dtw.C;
        j1q j1qVar = (j1q) qdv0Var.b;
        nwj nwjVar = new nwj(iu30Var, (byte) 4);
        lik1 lik1Var = (lik1) qdv0Var.c;
        switch (j1qVar.a) {
            case 0:
                i2q i2qVar = j1qVar.b;
                h2q h2qVar = (h2q) i2qVar.c.g1.get();
                daq daqVar = i2qVar.a;
                bs0Var = new bs0(h2qVar, (woa) daqVar.W8.get(), (kma) daqVar.Od.get(), (fpa) daqVar.X8.get(), nwjVar, lik1Var);
                break;
            default:
                thq thqVar = j1qVar.b;
                h2q h2qVar2 = (h2q) thqVar.c.b.W.get();
                daq daqVar2 = thqVar.b;
                bs0Var = new bs0(h2qVar2, (woa) daqVar2.W8.get(), (kma) daqVar2.Od.get(), (fpa) daqVar2.X8.get(), nwjVar, lik1Var);
                break;
        }
        this.b = mhc.d(context, viewGroup, bs0Var, (drw) null, 24);
    }

    public final void a(Object obj, ysw yswVar) {
        qez0 qez0Var;
        String str;
        CharSequence spannedString;
        int i;
        m4m m4mVar;
        byte b = this.a;
        int i2 = 8;
        int i3 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                uc3 uc3Var = (uc3) obj;
                ((PlayButtonView) obj2).B(new cet0(uc3Var instanceof tc3, new zft0(false, uc3Var instanceof qc3), (String) null, 4));
                break;
            case 1:
                ((qzh) ((dfm) obj2).i).f((iem) obj);
                break;
            case 2:
                dko dkoVar = (dko) obj;
                QuickActionView quickActionView = (QuickActionView) obj2;
                boolean z = dkoVar instanceof zjo;
                qez0 qez0Var2 = tez0.a;
                if (z) {
                    qez0Var = new qez0(new pk1(qk1.b, false, (String) null, (String) null, (j7p1) null, 30));
                } else if (dkoVar instanceof bko) {
                    qez0Var = sez0.a;
                } else if ((dkoVar instanceof ako) || dkoVar.equals(cko.a)) {
                    qez0Var = qez0Var2;
                } else {
                    eg.o();
                }
                quickActionView.a(qez0Var);
                quickActionView.setVisibility(qez0Var.equals(qez0Var2) ? 8 : 0);
                break;
            case 3:
                ((qzh) ((vzx) obj2).N0).f((iem) obj);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                MetadataRow metadataRow = (MetadataRow) obj2;
                metadataRow.A();
                ArrayList arrayList = ((smj0) obj).a;
                if (!arrayList.isEmpty()) {
                    dx0.f(metadataRow, (kkj0) o7h.q0(arrayList), false);
                }
                for (mmr0 mmr0Var : o7h.w1(arrayList)) {
                    kkj0 kkj0Var = (kkj0) mmr0Var.a;
                    kkj0 kkj0Var2 = (kkj0) mmr0Var.b;
                    dx0.f(metadataRow, kkj0Var2, (kkj0Var.a() || kkj0Var2.a()) ? false : true);
                }
                break;
            case 8:
                q5o0 q5o0Var = (q5o0) obj;
                View view = ((fcs) ((sbk) obj2).i).getView();
                sm81 sm81Var = q5o0Var.b;
                if (sm81Var.c && !sm81Var.b && (!sm81Var.d || !q5o0Var.c.a)) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                mie1 mie1Var = (mie1) obj;
                ThumbButtonView thumbButtonView = (ThumbButtonView) obj2;
                if (mie1Var.b) {
                    thumbButtonView.setVisibility(0);
                    thumbButtonView.d = mie1Var.a;
                    thumbButtonView.b();
                } else {
                    thumbButtonView.setVisibility(4);
                }
                break;
            case 12:
                qpf1 qpf1Var = (qpf1) obj;
                epf1 epf1Var = (epf1) obj2;
                ppf1 ppf1Var = qpf1Var.a;
                TextView textView = epf1Var.b;
                mpf1 mpf1Var = qpf1Var.b;
                boolean z2 = mpf1Var instanceof lpf1;
                textView.setVisibility(z2 ? 0 : 8);
                epf1Var.c.setVisibility((z2 && ((lpf1) mpf1Var).a) ? 0 : 8);
                boolean z3 = mpf1Var instanceof kpf1;
                epf1Var.d.setVisibility(z3 ? 0 : 8);
                if (z2) {
                    str = ((lpf1) mpf1Var).b;
                } else if (!z3) {
                    eg.o();
                } else {
                    str = "";
                }
                textView.setText(str);
                TextView textView2 = epf1Var.a;
                if (ppf1Var instanceof npf1) {
                    Context context = epf1Var.getContext();
                    npf1 npf1Var = (npf1) ppf1Var;
                    String str2 = npf1Var.b;
                    String str3 = npf1Var.c;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, 2132018087);
                    TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan(context, 2132018088);
                    if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) str3);
                        spannableStringBuilder.append((CharSequence) " • ");
                        spannableStringBuilder.setSpan(textAppearanceSpan2, length, spannableStringBuilder.length(), 17);
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) str2);
                        spannableStringBuilder.setSpan(textAppearanceSpan, length2, spannableStringBuilder.length(), 17);
                    } else {
                        int length3 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) str2);
                        spannableStringBuilder.setSpan(textAppearanceSpan, length3, spannableStringBuilder.length(), 17);
                        int length4 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) " • ");
                        spannableStringBuilder.append((CharSequence) str3);
                        spannableStringBuilder.setSpan(textAppearanceSpan2, length4, spannableStringBuilder.length(), 17);
                    }
                    spannedString = new SpannedString(spannableStringBuilder);
                } else if (!(ppf1Var instanceof opf1)) {
                    eg.o();
                } else {
                    spannedString = ((opf1) ppf1Var).b;
                }
                textView2.setText(spannedString);
                break;
            default:
                btj1 btj1Var = (btj1) obj;
                List list = btj1Var.c;
                boolean z4 = btj1Var.b;
                y2u0 y2u0Var = btj1Var.e;
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ltj1 ltj1Var = (ltj1) it.next();
                    int iC = l1d.C(ltj1Var.j);
                    if (iC == 0) {
                        m4mVar = m4m.a;
                    } else if (iC == i3) {
                        m4mVar = m4m.b;
                    } else if (iC != 2) {
                        eg.o();
                    } else {
                        m4mVar = m4m.c;
                    }
                    y2u0 y2u0Var2 = y2u0Var;
                    arrayList2.add(new jej1(!z4, ltj1Var.d, ltj1Var.a, ltj1Var.b, ltj1Var.e, ltj1Var.g, ltj1Var.h, ltj1Var.f, 1, ltj1Var.i, m4mVar, y2u0Var2.a(m4mVar), ltj1Var.k));
                    z4 = z4;
                    y2u0Var = y2u0Var2;
                    it = it;
                    obj2 = obj2;
                    i3 = 1;
                    break;
                }
                dtw dtwVar = (dtw) obj2;
                int iC2 = l1d.C(btj1Var.a);
                if (iC2 == 0) {
                    i = 1;
                } else if (iC2 != 1) {
                    eg.o();
                } else {
                    i = 2;
                }
                dtwVar.f(new kej1(btj1Var.d, arrayList2, i));
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (PlayButtonView) obj;
            case 1:
                return ((qzh) ((dfm) obj).i).getView();
            case 2:
                return (QuickActionView) obj;
            case 3:
                return ((qzh) ((vzx) obj).N0).getView();
            case 4:
                return (ConstraintLayout) obj;
            case 5:
                return (LinearLayout) obj;
            case 6:
                return (View) ((idd1) obj).getValue();
            case 7:
                return (MetadataRow) obj;
            case 8:
                return ((fcs) ((sbk) obj).i).getView();
            case 9:
                Context context = (Context) obj;
                TextView textView = new TextView(context);
                textView.setText(context.getResources().getString(2131955472));
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return textView;
            case 10:
                return (ConstraintLayout) ((e5l0) obj).b;
            case 11:
                return (ThumbButtonView) obj;
            case 12:
                return (epf1) obj;
            default:
                return ((dtw) obj).w;
        }
    }

    public wc3(Context context, dx0 dx0Var) {
        this.a = (byte) 4;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624649, (ViewGroup) null, false);
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428729);
        if (textView != null) {
            textView.setText((String) dx0Var.d);
            this.b = constraintLayoutInflate;
        } else {
            bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(2131428729)));
            throw null;
        }
    }

    public wc3(Context context, ViewGroup viewGroup, iu30 iu30Var) {
        this.a = (byte) 5;
        View viewInflate = LayoutInflater.from(context).inflate(2131624480, viewGroup, false);
        int i = 2131428933;
        if (((TextView) m5n1.t(viewInflate, 2131428933)) != null) {
            i = 2131428934;
            Button button = (Button) m5n1.t(viewInflate, 2131428934);
            if (button != null) {
                button.setOnClickListener(new aqs(iu30Var, (byte) 25));
                this.b = (LinearLayout) viewInflate;
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public wc3(d75 d75Var, ViewGroup viewGroup) {
        this.a = (byte) 10;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(d75Var.a).inflate(2131625367, viewGroup, false);
        int i = 2131428725;
        if (m5n1.t(constraintLayoutInflate, 2131428725) != null) {
            ConstraintLayout constraintLayout = constraintLayoutInflate;
            int i2 = 2131428727;
            if (((IconExclamationCircle) m5n1.t(constraintLayoutInflate, 2131428727)) != null) {
                i2 = 2131428732;
                if (m5n1.t(constraintLayoutInflate, 2131428732) != null) {
                    this.b = new e5l0(constraintLayout, (byte) 21);
                    return;
                }
            }
            i = i2;
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public wc3(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 9:
                this.b = context;
                break;
            default:
                this.b = new idd1(new qnd0(context, (byte) 7));
                break;
        }
    }

    public wc3(dfm dfmVar, iu30 iu30Var) {
        this.a = (byte) 1;
        this.b = dfmVar;
        ((qzh) dfmVar.i).n(new usj(iu30Var, (byte) 25));
    }

    public wc3(sbk sbkVar, iu30 iu30Var) {
        this.a = (byte) 8;
        this.b = sbkVar;
        ((fcs) sbkVar.i).n(new wck0(iu30Var, (byte) 9));
    }

    public wc3(Context context, dx0 dx0Var, char c) {
        this.a = (byte) 12;
        epf1 epf1Var = new epf1(context);
        qtw qtwVarA = f6o1.A((aor) dx0Var.d, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        ViewGroup viewGroup = (ViewGroup) epf1Var.d.getParent();
        f3l f3lVar = new f3l(12.0f, 2887, false);
        tka0 tka0Var = dtw.C;
        View view = mhc.b(viewGroup.getContext(), viewGroup, qtwVarA, f3lVar, (ipb1) null, 112).w;
        k8p1.o(epf1Var.d, view);
        epf1Var.d = view;
        this.b = epf1Var;
    }

    public wc3(Context context, iu30 iu30Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                QuickActionView quickActionView = new QuickActionView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                quickActionView.a = new m0o(iu30Var, (byte) 1);
                this.b = quickActionView;
                break;
            default:
                PlayButtonView playButtonView = new PlayButtonView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                playButtonView.n(new ib2(iu30Var, (byte) 12));
                this.b = playButtonView;
                break;
        }
    }

    public wc3(vzx vzxVar, iu30 iu30Var) {
        this.a = (byte) 3;
        this.b = vzxVar;
        ((qzh) vzxVar.N0).n(new hws(iu30Var, (byte) 29));
    }

    public wc3(vzx vzxVar, Context context, iu30 iu30Var) {
        ThumbButtonView thumbButtonViewInflate;
        this.a = (byte) 11;
        if (vzxVar.d) {
            int i = ThumbButtonView.i;
            thumbButtonViewInflate = (ThumbButtonView) View.inflate(context, 2131626249, null);
        } else {
            int i2 = ThumbButtonView.i;
            thumbButtonViewInflate = View.inflate(context, 2131626248, null);
        }
        thumbButtonViewInflate.setDrawableSize(context.getResources().getDimensionPixelSize(2131165723));
        thumbButtonViewInflate.setActiveColor(2131101342);
        thumbButtonViewInflate.n(new cmd1(thumbButtonViewInflate, iu30Var, (byte) 9));
        this.b = thumbButtonViewInflate;
    }

    public wc3(Context context, dx0 dx0Var, byte b) {
        this.a = (byte) 7;
        this.b = new MetadataRow(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }
}
