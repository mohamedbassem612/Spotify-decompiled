package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.icons.IconDownloaded;
import com.spotify.recents.uiusecases.stackedartwork.StackedArtworkComposeView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dds implements qzh {
    public static final idd1 b = new idd1(n0r.U0);
    public final s880 a;

    public dds(Context context, gw70 gw70Var, i3h i3hVar) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625339, (ViewGroup) null, false);
        int i = 2131427690;
        if (m5n1.t(constraintLayoutInflate, 2131427690) != null) {
            ConstraintLayout constraintLayout = constraintLayoutInflate;
            i = 2131428520;
            IconDownloaded iconDownloadedT = m5n1.t(constraintLayoutInflate, 2131428520);
            if (iconDownloadedT != null) {
                i = 2131429612;
                View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131429612);
                if (view != null) {
                    i = 2131429973;
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131429973);
                    if (textView != null) {
                        i = 2131430530;
                        ProgressBar progressBar = (ProgressBar) m5n1.t(constraintLayoutInflate, 2131430530);
                        if (progressBar != null) {
                            i = 2131431060;
                            View view2 = (StackedArtworkComposeView) m5n1.t(constraintLayoutInflate, 2131431060);
                            if (view2 != null) {
                                i = 2131431115;
                                TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                                if (textView2 != null) {
                                    i = 2131431120;
                                    if (m5n1.t(constraintLayoutInflate, 2131431120) != null) {
                                        i = 2131431131;
                                        if (m5n1.t(constraintLayoutInflate, 2131431131) != null) {
                                            i = 2131431356;
                                            TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                            if (textView3 != null) {
                                                s880 s880Var = new s880(constraintLayout, iconDownloadedT, view, textView, progressBar, view2, textView2, textView3);
                                                view.setViewContext(new f47(gw70Var));
                                                view2.setImageLoader(gw70Var);
                                                view2.setCollectionDrawableProvider(i3hVar);
                                                v9w0 v9w0VarP = b2u.p(constraintLayout);
                                                ArrayList arrayList = v9w0VarP.c;
                                                Collections.addAll(arrayList, textView3);
                                                Collections.addAll(arrayList, textView2);
                                                Collections.addAll(arrayList, textView);
                                                Collections.addAll(v9w0VarP.d, view, view2);
                                                v9w0VarP.a();
                                                this.a = s880Var;
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
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static boolean a(qup0 qup0Var) {
        return qup0Var.h.floatValue() > 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    public final void f(Object obj) {
        int i;
        int i2;
        qup0 qup0Var = (qup0) obj;
        String str = qup0Var.b;
        int i3 = qup0Var.i;
        s880 s880Var = this.a;
        TextView textView = (TextView) s880Var.a;
        StackedArtworkComposeView stackedArtworkComposeView = (StackedArtworkComposeView) s880Var.g;
        ArtworkView artworkView = (ArtworkView) s880Var.d;
        textView.setText(qup0Var.a);
        ((ConstraintLayout) s880Var.b).setContentDescription(qup0Var.d);
        List list = qup0Var.c;
        boolean zIsEmpty = list.isEmpty();
        idd1 idd1Var = b;
        if (zIsEmpty) {
            artworkView.setVisibility(0);
            artworkView.h((e17) idd1Var.getValue());
            stackedArtworkComposeView.setVisibility(8);
        } else if (qup0Var.j) {
            artworkView.setVisibility(8);
            stackedArtworkComposeView.setVisibility(0);
            c380 c380VarA = mqo1.A(list);
            fkt fktVar = qup0Var.g;
            stackedArtworkComposeView.f(new eab1(c380VarA, fktVar != null ? new ekt(fktVar) : null));
        } else {
            e17 e17Var = (o17) o7h.s0(list);
            if (e17Var == null) {
                e17Var = (e17) idd1Var.getValue();
            }
            artworkView.h(e17Var);
            artworkView.setVisibility(0);
            stackedArtworkComposeView.setVisibility(8);
        }
        TextView textView2 = (TextView) s880Var.h;
        textView2.setText(str);
        int iC = l1d.C(i3);
        boolean z = true;
        if (iC != 0) {
            if (iC != 1) {
                eg.o();
                return;
            } else if (str == null || ihc1.y0(str)) {
                i = 8;
            } else {
                i = 0;
            }
        } else if (a(qup0Var) || str == null || ihc1.y0(str)) {
            i = 8;
        } else {
            i = 0;
        }
        textView2.setVisibility(i);
        int iC2 = l1d.C(i3);
        if (iC2 == 0) {
            i2 = 1;
        } else if (iC2 != 1) {
            eg.o();
            return;
        } else if (a(qup0Var)) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        textView2.setMaxLines(i2);
        TextView textView3 = (TextView) s880Var.e;
        textView3.setText((CharSequence) null);
        int iC3 = l1d.C(i3);
        if (iC3 != 0 && iC3 != 1) {
            eg.o();
            return;
        }
        textView3.setVisibility(8);
        ProgressBar progressBar = (ProgressBar) s880Var.f;
        progressBar.setVisibility(a(qup0Var) ? 0 : 8);
        progressBar.setProgress(jch0.U(qup0Var.h.floatValue() * 100.0f));
        IconDownloaded iconDownloaded = (IconDownloaded) s880Var.c;
        boolean z2 = qup0Var.f;
        int iC4 = l1d.C(i3);
        if (iC4 != 0) {
            if (iC4 != 1) {
                eg.o();
                return;
            }
            z = z2;
        } else if (a(qup0Var) || !z2) {
            z = false;
        }
        iconDownloaded.setVisibility(z ? 0 : 8);
    }

    public final View getView() {
        return (ConstraintLayout) this.a.b;
    }

    public final void n(iu30 iu30Var) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.a.b;
        constraintLayout.setOnClickListener(new o0s(iu30Var, (byte) 22));
        constraintLayout.setOnLongClickListener(new wer(iu30Var, (byte) 7));
    }
}
