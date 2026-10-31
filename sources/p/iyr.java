package p;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.TextStyle;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iyr implements qzh {
    public static final DateTimeFormatter d = DateTimeFormatter.ofPattern("EEE");
    public static final DateTimeFormatter e = DateTimeFormatter.ofPattern("h:mma");
    public static final DateTimeFormatter f = DateTimeFormatter.ofPattern("H:mm");
    public final Context a;
    public final p410 b;
    public final RoundedConstraintLayout c;

    public iyr(Context context, gw70 gw70Var) {
        this.a = context;
        RoundedConstraintLayout roundedConstraintLayoutInflate = LayoutInflater.from(context).inflate(2131625146, (ViewGroup) null, false);
        int i = 2131427851;
        if (m5n1.t(roundedConstraintLayoutInflate, 2131427851) != null) {
            RoundedConstraintLayout roundedConstraintLayout = roundedConstraintLayoutInflate;
            i = 2131428160;
            if (((LinearLayout) m5n1.t(roundedConstraintLayoutInflate, 2131428160)) != null) {
                i = 2131428161;
                TextView textView = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131428161);
                if (textView != null) {
                    i = 2131428163;
                    TextView textView2 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131428163);
                    if (textView2 != null) {
                        i = 2131428169;
                        TextView textView3 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131428169);
                        if (textView3 != null) {
                            i = 2131428172;
                            TextView textView4 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131428172);
                            if (textView4 != null) {
                                i = 2131429612;
                                View view = (ArtworkView) m5n1.t(roundedConstraintLayoutInflate, 2131429612);
                                if (view != null) {
                                    i = 2131430735;
                                    EncoreButton encoreButtonT = m5n1.t(roundedConstraintLayoutInflate, 2131430735);
                                    if (encoreButtonT != null) {
                                        i = 2131431356;
                                        TextView textView5 = (TextView) m5n1.t(roundedConstraintLayoutInflate, 2131431356);
                                        if (textView5 != null) {
                                            this.b = new p410(roundedConstraintLayout, textView, textView2, textView3, textView4, view, encoreButtonT, textView5);
                                            this.c = roundedConstraintLayout;
                                            view.setViewContext(new f47(gw70Var));
                                            v9w0 v9w0VarP = b2u.p(roundedConstraintLayout);
                                            Collections.addAll(v9w0VarP.d, view);
                                            Collections.addAll(v9w0VarP.c, textView5, textView4, textView3, textView, textView2);
                                            v9w0VarP.a();
                                            return;
                                        }
                                    }
                                }
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
        boolean z = d900Var.e;
        p410 p410Var = this.b;
        ((TextView) p410Var.h).setText(d900Var.a);
        ((TextView) p410Var.e).setText(d900Var.b);
        OffsetDateTime offsetDateTime = d900Var.c;
        if (offsetDateTime != null) {
            int dayOfMonth = offsetDateTime.getDayOfMonth();
            String displayName = offsetDateTime.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault());
            String str = offsetDateTime.format(d);
            Context context = this.a;
            ((TextView) p410Var.d).setText(String.format(context.getString(2131955774), Arrays.copyOf(new Object[]{str, offsetDateTime.format(DateFormat.is24HourFormat(context) ? f : e).toLowerCase(Locale.ROOT)}, 2)));
            ((TextView) p410Var.c).setText(displayName);
            ((TextView) p410Var.b).setText(String.valueOf(dayOfMonth));
        }
        ((ArtworkView) p410Var.f).h(d900Var.d);
        EncoreButton encoreButton = (EncoreButton) p410Var.g;
        encoreButton.setText(z ? encoreButton.getContext().getString(2131955777) : encoreButton.getContext().getString(2131955776));
        encoreButton.setChecked(z);
    }

    public final View getView() {
        return this.c;
    }

    public final void n(iu30 iu30Var) {
        this.c.setOnClickListener(new trr(iu30Var, (byte) 20));
        ((EncoreButton) this.b.g).setOnClickListener(new trr(iu30Var, (byte) 21));
    }
}
