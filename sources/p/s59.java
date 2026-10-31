package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.puffin.setup.setupflow.autodetect.ui.AutodetectView;
import com.spotify.puffin.setup.setupflow.manualselect.ui.AmbiguousDeviceSelectView;
import com.spotify.puffin.setup.setupflow.manualselect.ui.ManualSelectView;
import com.spotify.puffin.setup.setupflow.ui.ErrorView;
import com.spotify.puffin.sharedui.views.DisconnectedView;
import com.spotify.transcript.commons.views.ElementContainer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s59 implements p4h1, Connectable {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;
    public final Object d;

    public s59(LayoutInflater layoutInflater, ViewGroup viewGroup, byte b) {
        this.a = b;
        int i = 2131429818;
        switch (b) {
            case 1:
                ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625475, viewGroup, false);
                AmbiguousDeviceSelectView ambiguousDeviceSelectView = (AmbiguousDeviceSelectView) m5n1.t(constraintLayoutInflate, 2131427572);
                if (ambiguousDeviceSelectView != null) {
                    EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131427670);
                    if (encoreButtonT != null) {
                        ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131427709);
                        if (composeViewT == null) {
                            i = 2131427709;
                        } else if (((LinearLayout) m5n1.t(constraintLayoutInflate, 2131427775)) != null) {
                            EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate, 2131428103);
                            if (encoreButtonT2 != null) {
                                DisconnectedView disconnectedViewT = m5n1.t(constraintLayoutInflate, 2131428487);
                                if (disconnectedViewT != null) {
                                    ErrorView errorView = (ErrorView) m5n1.t(constraintLayoutInflate, 2131428718);
                                    if (errorView != null) {
                                        ProgressBar progressBar = (ProgressBar) m5n1.t(constraintLayoutInflate, 2131429818);
                                        if (progressBar != null) {
                                            i = 2131429888;
                                            ManualSelectView manualSelectView = (ManualSelectView) m5n1.t(constraintLayoutInflate, 2131429888);
                                            if (manualSelectView != null) {
                                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                this.d = new mzr0(constraintLayout, ambiguousDeviceSelectView, encoreButtonT, composeViewT, encoreButtonT2, disconnectedViewT, errorView, progressBar, manualSelectView);
                                                this.c = constraintLayout;
                                                rwq0.s(constraintLayout, new otf0(this, (byte) 11));
                                                composeViewT.setViewCompositionStrategy(p5x0.W0);
                                                composeViewT.setContent(izi.b);
                                                eb80 eb80Var = new eb80(this, (byte) 23);
                                                manualSelectView.U0.f = new e4f0(eb80Var, (byte) 21);
                                                fry0 fry0Var = manualSelectView.binding;
                                                fry0Var.b.setOnClickListener(new hid0(eb80Var, (byte) 2));
                                                fry0Var.c.n(new j2d0(eb80Var, manualSelectView, (byte) 25));
                                                zud0 zud0Var = new zud0(this, (byte) 7);
                                                ambiguousDeviceSelectView.U0.f = new iz3(zud0Var, (byte) 0);
                                                epy0 epy0Var = ambiguousDeviceSelectView.binding;
                                                epy0Var.c.n(new iz3(zud0Var, (byte) 1));
                                                epy0Var.b.setOnClickListener(new c20(zud0Var, (byte) 5));
                                                return;
                                            }
                                        }
                                    } else {
                                        i = 2131428718;
                                    }
                                } else {
                                    i = 2131428487;
                                }
                            } else {
                                i = 2131428103;
                            }
                        } else {
                            i = 2131427775;
                        }
                    } else {
                        i = 2131427670;
                    }
                } else {
                    i = 2131427572;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
            default:
                ConstraintLayout constraintLayoutInflate2 = layoutInflater.inflate(2131625471, viewGroup, false);
                AutodetectView autodetectView = (AutodetectView) m5n1.t(constraintLayoutInflate2, 2131427653);
                if (autodetectView != null) {
                    EncoreButton encoreButtonT3 = m5n1.t(constraintLayoutInflate2, 2131427670);
                    if (encoreButtonT3 != null) {
                        ComposeView composeViewT2 = m5n1.t(constraintLayoutInflate2, 2131427709);
                        if (composeViewT2 == null) {
                            i = 2131427709;
                        } else if (((LinearLayout) m5n1.t(constraintLayoutInflate2, 2131427775)) != null) {
                            EncoreButton encoreButtonT4 = m5n1.t(constraintLayoutInflate2, 2131428103);
                            if (encoreButtonT4 != null) {
                                DisconnectedView disconnectedViewT2 = m5n1.t(constraintLayoutInflate2, 2131428487);
                                if (disconnectedViewT2 != null) {
                                    ErrorView errorView2 = (ErrorView) m5n1.t(constraintLayoutInflate2, 2131428718);
                                    if (errorView2 != null) {
                                        ProgressBar progressBar2 = (ProgressBar) m5n1.t(constraintLayoutInflate2, 2131429818);
                                        if (progressBar2 != null) {
                                            ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                                            this.d = new bjx(constraintLayout2, autodetectView, encoreButtonT3, composeViewT2, encoreButtonT4, disconnectedViewT2, errorView2, progressBar2);
                                            this.c = constraintLayout2;
                                            rwq0.s(constraintLayout2, new ub3(this, (byte) 24));
                                            composeViewT2.setViewCompositionStrategy(p5x0.W0);
                                            composeViewT2.setContent(g8i.b);
                                            return;
                                        }
                                    } else {
                                        i = 2131428718;
                                    }
                                } else {
                                    i = 2131428487;
                                }
                            } else {
                                i = 2131428103;
                            }
                        } else {
                            i = 2131427775;
                        }
                    } else {
                        i = 2131427670;
                    }
                } else {
                    i = 2131427653;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
                throw null;
        }
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                bjx bjxVar = (bjx) obj;
                ((EncoreButton) bjxVar.c).setOnClickListener(new r59(this, (byte) 0));
                ((EncoreButton) bjxVar.d).setOnClickListener(new r59(this, (byte) 1));
                this.b = consumer;
                return new rp(this, (byte) 11);
            case 1:
                mzr0 mzr0Var = (mzr0) obj;
                ((EncoreButton) mzr0Var.b).setOnClickListener(new nkg0(this, (byte) 0));
                ((EncoreButton) mzr0Var.c).setOnClickListener(new nkg0(this, (byte) 1));
                this.b = consumer;
                return new n1b0(this, (byte) 7);
            default:
                return new n1b0(this, (byte) 22);
        }
    }

    public final View a() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (ConstraintLayout) obj;
            case 1:
                return (ConstraintLayout) obj;
            default:
                return (View) this.b;
        }
    }

    public s59(View view, dx0 dx0Var, d83 d83Var) {
        this.a = (byte) 2;
        this.b = view;
        this.d = dx0Var;
        this.c = new idd1(new ba01(this, (byte) 1));
        ElementContainer elementContainer = (ElementContainer) new idd1(new ba01(this, (byte) 0)).getValue();
        elementContainer.removeAllViews();
        tka0 tka0Var = dtw.C;
        elementContainer.addView(mhc.b(elementContainer.getContext(), elementContainer, d83Var, rih1.a, (ipb1) null, 112).w);
    }
}
