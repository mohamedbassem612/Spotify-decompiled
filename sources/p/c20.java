package p;

import android.R;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Message;
import android.text.Editable;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.address.addressimpl.view.NonCompletingAutoCompleteTextView;
import com.spotify.adsdisplay.products.cmp.CMPActivity;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewView;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c20 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c20(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((o60) obj).b();
                return;
            case 1:
                ((tzf0) obj).invoke();
                return;
            case 2:
                ((nn2) obj).g.onNext(oh2.a);
                return;
            case 3:
                th3 th3Var = (th3) obj;
                if (view == th3Var.i && (message3 = th3Var.k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == th3Var.l && (message2 = th3Var.n) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == th3Var.o && (message = th3Var.q) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                th3Var.E.obtainMessage(1, th3Var.b).sendToTarget();
                return;
            case 4:
                aj3 aj3Var = (aj3) obj;
                aj3Var.e.m();
                aj3Var.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://alexa.amazon.com/spa/index.html#settings/music-settings/service-preferences")).addFlags(268435456));
                return;
            case 5:
                Consumer consumer = (Consumer) ((s59) ((zud0) obj).b).b;
                if (consumer != null) {
                    consumer.accept(ijg0.a);
                    return;
                }
                return;
            case 6:
                ((iu30) ((b14) obj).b).invoke(s04.a);
                return;
            case 7:
                ((BehaviorSubject) ((qd8) obj).b.g).onNext(new xd8((String) null));
                return;
            case 8:
                f39 f39Var = (f39) obj;
                j320 state = f39Var.getState();
                if ((state != null ? state.e : null) == null || f39Var.b.getCount() <= 0) {
                    return;
                }
                ((NonCompletingAutoCompleteTextView) f39Var.a.e).showDropDown();
                return;
            case 9:
                jj11 jj11Var = (jj11) obj;
                jj11Var.e.invoke();
                jj11Var.h();
                return;
            case 10:
                cwb cwbVar = (cwb) obj;
                if (cwbVar.t && cwbVar.isShowing()) {
                    if (!cwbVar.Y) {
                        TypedArray typedArrayObtainStyledAttributes = cwbVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        cwbVar.X = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        cwbVar.Y = true;
                    }
                    if (cwbVar.X) {
                        cwbVar.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((CMPActivity) obj).finish();
                return;
            case 12:
                ((CallingCodePickerActivity) obj).m0().a();
                return;
            case 13:
                ((e7p0) obj).c();
                return;
            case 14:
                ((s5e) obj).c.a.onNext(f5e.a);
                return;
            case 15:
                pyf pyfVar = (pyf) obj;
                uba ubaVar = pyfVar.e2;
                if (ubaVar == null) {
                    u890.C("ubiLogger");
                    throw null;
                }
                dsk0 dsk0Var = pyfVar.g2;
                if (dsk0Var == null) {
                    u890.C("webviewEventsFact");
                    throw null;
                }
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                tv80 tv80VarM = ubaVar.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                uyf uyfVar = pyfVar.i2;
                if (uyfVar == null) {
                    u890.C("listener");
                    throw null;
                }
                String str = tv80VarM.a.a;
                m021 m021Var = uyfVar.a;
                try {
                    ((a1r0) m021Var.c).l();
                    return;
                } catch (IllegalArgumentException unused) {
                    ((q7r0) m021Var.b).c(str);
                    return;
                }
            case 16:
                iu30 iu30Var = ((CircularVideoPreviewView) obj).g;
                if (iu30Var != null) {
                    iu30Var.invoke(wcg.a);
                    return;
                }
                return;
            case 17:
                ((ym) obj).invoke(pc7.a);
                return;
            case 18:
                TextInputLayout textInputLayout = ((mzx) ((mgg) obj)).a;
                Editable text = textInputLayout.getEditText().getText();
                if (text != null) {
                    text.clear();
                }
                textInputLayout.k(textInputLayout.I1, textInputLayout.K1);
                return;
            case 19:
                ((nx30) obj).run();
                return;
            case 20:
                ((gmj) obj).invoke();
                return;
            case 21:
                ((k2l) obj).Z0(false, false);
                return;
            case 22:
                rfm rfmVar = (rfm) obj;
                i8h1 i8h1VarR1 = rfmVar.r1();
                ynb0 ynb0Var = rfmVar.i2;
                if (ynb0Var == null) {
                    u890.C("eventFactory");
                    throw null;
                }
                i3l0 i3l0Var = (i3l0) ynb0Var.get();
                i3l0Var.getClass();
                x6h1 x6h1VarC2 = i3l0Var.a.c();
                x6h1VarC2.i.add(new a7h1("sheet", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                rfmVar.q1().e(new yrn0(i8h1VarR1.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a));
                cwb cwbVar2 = ((t2u) rfmVar).Q1;
                if (cwbVar2 != null) {
                    cwbVar2.cancel();
                    return;
                }
                return;
            case 23:
                m021 m021Var2 = ((jbn) obj).d;
                try {
                    ((a1r0) m021Var2.c).l();
                    return;
                } catch (IllegalArgumentException unused2) {
                    ((q7r0) m021Var2.b).c("");
                    return;
                }
            case 24:
                AppCompatCheckBox appCompatCheckBox = ((mdr) obj).g;
                appCompatCheckBox.setChecked(!appCompatCheckBox.isChecked());
                return;
            case 25:
                Function0 function0 = ((ujr) obj).n1;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 26:
                iu30 iu30Var2 = ((srr) obj).f;
                if (iu30Var2 != null) {
                    iu30Var2.invoke(pfo.a);
                    return;
                }
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                iu30 event$src_main_java_com_spotify_creativeworkplatform_encore_encore = ((str) obj).getEvent$src_main_java_com_spotify_creativeworkplatform_encore_encore();
                if (event$src_main_java_com_spotify_creativeworkplatform_encore_encore != null) {
                    event$src_main_java_com_spotify_creativeworkplatform_encore_encore.invoke(vdt.a);
                    return;
                }
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((iu30) ((h98) obj).d).invoke(ub80.a);
                return;
            default:
                ((d7s) ((iir) obj).b).invoke(nsg0.a);
                return;
        }
    }
}
