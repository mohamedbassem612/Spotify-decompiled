package p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconX;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fsg0 implements h8l {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public fsg0(lzn0 lzn0Var, ViewGroup viewGroup, LayoutInflater layoutInflater, cir0 cir0Var, moq moqVar) {
        this.a = (byte) 1;
        this.b = moqVar;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625586, viewGroup, false);
        int i = 2131427685;
        EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131427685);
        if (encoreTextViewT != null) {
            i = 2131428104;
            IconX iconXT = m5n1.t(constraintLayoutInflate, 2131428104);
            if (iconXT != null) {
                i = 2131428465;
                EditText editText = (EditText) m5n1.t(constraintLayoutInflate, 2131428465);
                if (editText != null) {
                    i = 2131428497;
                    View viewT = m5n1.t(constraintLayoutInflate, 2131428497);
                    if (viewT != null) {
                        i = 2131428859;
                        if (m5n1.t(constraintLayoutInflate, 2131428859) != null) {
                            i = 2131430244;
                            MaterialRadioButton materialRadioButtonT = m5n1.t(constraintLayoutInflate, 2131430244);
                            if (materialRadioButtonT != null) {
                                i = 2131430562;
                                if (m5n1.t(constraintLayoutInflate, 2131430562) != null) {
                                    i = 2131430654;
                                    EncoreTextView encoreTextViewT2 = m5n1.t(constraintLayoutInflate, 2131430654);
                                    if (encoreTextViewT2 != null) {
                                        i = 2131430658;
                                        RadioGroup radioGroup = (RadioGroup) m5n1.t(constraintLayoutInflate, 2131430658);
                                        if (radioGroup != null) {
                                            i = 2131431013;
                                            if (m5n1.t(constraintLayoutInflate, 2131431013) != null) {
                                                i = 2131431109;
                                                EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131431109);
                                                if (encoreButtonT != null) {
                                                    i = 2131431356;
                                                    if (m5n1.t(constraintLayoutInflate, 2131431356) != null) {
                                                        i = 2131431548;
                                                        MaterialRadioButton materialRadioButtonT2 = m5n1.t(constraintLayoutInflate, 2131431548);
                                                        if (materialRadioButtonT2 != null) {
                                                            i = 2131431716;
                                                            MaterialRadioButton materialRadioButtonT3 = m5n1.t(constraintLayoutInflate, 2131431716);
                                                            if (materialRadioButtonT3 != null) {
                                                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                                this.c = new bz11(constraintLayout, encoreTextViewT, iconXT, editText, viewT, materialRadioButtonT, encoreTextViewT2, radioGroup, encoreButtonT, materialRadioButtonT2, materialRadioButtonT3);
                                                                this.d = new o1r0(constraintLayout, cir0Var, lzn0Var);
                                                                this.e = new FrameLayout(constraintLayout.getContext());
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
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((goq) obj).f = new m42(consumer, (byte) 21);
                return new n1b0(this, (byte) 8);
            default:
                bz11 bz11Var = (bz11) this.c;
                kt91 kt91Var = (kt91) ((ej21) ((jnq) ((moq) obj).a.c).c).f.get();
                c8o.l(kt91Var);
                this.f = new sj21(bz11Var, consumer, kt91Var);
                ((IconX) bz11Var.c).setOnClickListener(new hid0(this, (byte) 22));
                return new n1b0(this, (byte) 26);
        }
    }

    public final Object getView() {
        switch (this.a) {
            case 0:
                return (ConstraintLayout) this.f;
            default:
                return (FrameLayout) this.e;
        }
    }

    public final Bundle serialize() {
        switch (this.a) {
            case 0:
                return new Bundle();
            default:
                return mno1.g();
        }
    }

    public final void start() {
        switch (this.a) {
            case 0:
                ((r1q0) this.c).b((ydb) this.e);
                break;
            default:
                ((o1r0) this.d).show();
                break;
        }
    }

    public final void stop() {
        switch (this.a) {
            case 0:
                ((ydb) this.e).e();
                break;
            default:
                ((o1r0) this.d).dismiss();
                break;
        }
    }

    public fsg0(goq goqVar, r1q0 r1q0Var, PublishSubject publishSubject) {
        this.a = (byte) 0;
        this.b = goqVar;
        this.c = r1q0Var;
        this.d = publishSubject;
        this.e = new ydb(this, (byte) 14);
        this.f = (ConstraintLayout) goqVar.h;
    }
}
