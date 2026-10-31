package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class en extends emc0 implements Connectable {
    public final gw70 e;
    public final ycc1 f;
    public final PublishSubject g;

    public en(gw70 gw70Var, ycc1 ycc1Var) {
        super(kn5.n);
        this.e = gw70Var;
        this.f = ycc1Var;
        this.g = new PublishSubject();
    }

    public final Connection L(Consumer consumer) {
        return new cn(this.g.subscribe(new dn(consumer, (byte) 0)), this, (byte) 0);
    }

    public final int g(int i) {
        return ((r8i1) A(i)).a ? 1 : 0;
    }

    public final void n(int i, w611 w611Var) {
        String string;
        List listX;
        vn vnVar = (vn) w611Var;
        boolean z = vnVar instanceof sn;
        PublishSubject publishSubject = this.g;
        if (z) {
            sn snVar = (sn) vnVar;
            ((ConstraintLayout) snVar.W0.b).setOnClickListener(new rn(snVar, i, new n5(1, publishSubject, Subject.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, (byte) 2)));
            return;
        }
        if (!(vnVar instanceof un)) {
            eg.o();
            return;
        }
        un unVar = (un) vnVar;
        q8i1 q8i1Var = (q8i1) A(i);
        n5 n5Var = new n5(1, publishSubject, Subject.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, (byte) 3);
        unVar.W0.j(new o480(i));
        dlg1 dlg1Var = unVar.X0;
        FaceView faceView = (FaceView) dlg1Var.b;
        gw70 gw70Var = unVar.V0;
        String str = q8i1Var.d;
        String str2 = q8i1Var.b;
        String str3 = q8i1Var.c;
        td10 td10Var = new td10(str, str2, str3, (sd10) null);
        int i2 = FaceView.f;
        faceView.g(gw70Var, td10Var, (nww0) null);
        TextView textView = (TextView) dlg1Var.c;
        int iEnd = 0;
        if (str3 != null && (string = ihc1.e1(str3).toString()) != null) {
            Pattern patternCompile = Pattern.compile("\\s+");
            ihc1.N0(0);
            Matcher matcher = patternCompile.matcher(string);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                do {
                    arrayList.add(string.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(string.subSequence(iEnd, string.length()).toString());
                listX = arrayList;
            } else {
                listX = k4p1.x(string.toString());
            }
            iEnd = listX.size();
        }
        int i3 = iEnd > 1 ? 2 : 1;
        textView.setLines(i3);
        textView.setMaxLines(i3);
        textView.setText(str3);
        ((ConstraintLayout) dlg1Var.a).setOnClickListener(new tn(unVar, i, n5Var, q8i1Var));
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        ycc1 ycc1Var = this.f;
        if (i == 0) {
            ConstraintLayout constraintLayoutL = eqq.l(viewGroup, 2131626292, viewGroup, false);
            int i2 = 2131428815;
            FaceView faceViewT = m5n1.t(constraintLayoutL, 2131428815);
            if (faceViewT != null) {
                i2 = 2131430097;
                TextView textView = (TextView) m5n1.t(constraintLayoutL, 2131430097);
                if (textView != null) {
                    return new un(this.e, ycc1Var, new dlg1(constraintLayoutL, faceViewT, textView));
                }
            }
            bhn0.i("Missing required view with ID: ".concat(constraintLayoutL.getResources().getResourceName(i2)));
            return null;
        }
        ConstraintLayout constraintLayoutL2 = eqq.l(viewGroup, 2131624024, viewGroup, false);
        int i3 = 2131427852;
        View viewT = m5n1.t(constraintLayoutL2, 2131427852);
        if (viewT != null) {
            i3 = 2131429710;
            if (m5n1.t(constraintLayoutL2, 2131429710) != null) {
                i3 = 2131430427;
                if (m5n1.t(constraintLayoutL2, 2131430427) != null) {
                    return new sn(ycc1Var, new ycc1(constraintLayoutL2, viewT, (byte) 17));
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutL2.getResources().getResourceName(i3)));
        return null;
    }
}
