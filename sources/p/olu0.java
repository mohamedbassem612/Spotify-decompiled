package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import j$.time.DayOfWeek;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.TextStyle;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class olu0 implements qzh {
    public static final DateTimeFormatter c = DateTimeFormatter.ofPattern("h:mma");
    public final Context a;
    public final bjx b;

    public olu0(Context context) {
        this.a = context;
        RoundedConstraintLayout roundedConstraintLayoutInflate = LayoutInflater.from(context).inflate(2131625412, (ViewGroup) null, false);
        int i = 2131427521;
        AddToButtonView addToButtonViewT = m5n1.t(roundedConstraintLayoutInflate, 2131427521);
        if (addToButtonViewT != null) {
            i = 2131427687;
            if (m5n1.t(roundedConstraintLayoutInflate, 2131427687) != null) {
                i = 2131427877;
                CalendarIconView calendarIconView = (CalendarIconView) m5n1.t(roundedConstraintLayoutInflate, 2131427877);
                if (calendarIconView != null) {
                    RoundedConstraintLayout roundedConstraintLayout = roundedConstraintLayoutInflate;
                    i = 2131428169;
                    TextView textView = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131428169);
                    if (textView != null) {
                        i = 2131428172;
                        TextView textView2 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131428172);
                        if (textView2 != null) {
                            i = 2131431356;
                            TextView textView3 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131431356);
                            if (textView3 != null) {
                                this.b = new bjx(roundedConstraintLayout, addToButtonViewT, calendarIconView, textView, textView2, textView3, (byte) 20);
                                v9w0 v9w0VarP = b2u.p(roundedConstraintLayout);
                                Collections.addAll(v9w0VarP.c, textView3, textView, textView2);
                                v9w0VarP.a();
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(roundedConstraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        d900 d900Var = (d900) obj;
        bjx bjxVar = this.b;
        ((TextView) bjxVar.g).setText(d900Var.a);
        ((TextView) bjxVar.f).setText(d900Var.b);
        OffsetDateTime offsetDateTime = d900Var.c;
        if (offsetDateTime != null) {
            int dayOfMonth = offsetDateTime.getDayOfMonth();
            String lowerCase = offsetDateTime.format(c).toLowerCase(Locale.ROOT);
            DayOfWeek dayOfWeek = offsetDateTime.getDayOfWeek();
            TextStyle textStyle = TextStyle.SHORT;
            String displayName = dayOfWeek.getDisplayName(textStyle, Locale.getDefault());
            String displayName2 = offsetDateTime.getMonth().getDisplayName(textStyle, Locale.getDefault());
            ((TextView) bjxVar.e).setText(String.format(this.a.getString(2131955773), Arrays.copyOf(new Object[]{displayName, Integer.valueOf(dayOfMonth), displayName2, Integer.valueOf(offsetDateTime.getYear()), lowerCase}, 5)));
            displayName2.getClass();
            ((CalendarIconView) bjxVar.d).f(new xwc(252, null, null, displayName2, String.valueOf(dayOfMonth), false));
        }
        ((AddToButtonView) bjxVar.c).a(new pk1(d900Var.e ? qk1.b : qk1.a, true, (String) null, (String) null, (j7p1) null, 28));
    }

    public final View getView() {
        return (RoundedConstraintLayout) this.b.b;
    }

    public final void n(iu30 iu30Var) {
        bjx bjxVar = this.b;
        ((RoundedConstraintLayout) bjxVar.b).setOnClickListener(new jn90(iu30Var, (byte) 22));
        ((AddToButtonView) bjxVar.c).setOnClickListener(new jn90(iu30Var, (byte) 23));
    }
}
