package p;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tge implements mto0, CompoundButton.OnCheckedChangeListener {
    public final bi90 a;
    public final kfe b;
    public final vu30 c;

    public tge(bi90 bi90Var, kfe kfeVar, vu30 vu30Var) {
        this.a = bi90Var;
        this.b = kfeVar;
        this.c = vu30Var;
    }

    public final void a(Context context, nx40 nx40Var) {
        String string;
        boolean zJ;
        boolean zJ2;
        su31 su31Var = (tw31) nx40Var;
        TextView textViewC = su31Var.c();
        kfe kfeVar = this.b;
        int iOrdinal = kfeVar.ordinal();
        final byte b = 1;
        if (iOrdinal == 0) {
            string = context.getString(2131953528);
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            string = context.getString(2131953525);
        }
        textViewC.setText(string);
        rh90 rh90Var = this.a;
        if (rh90Var instanceof rh90) {
            SwitchCompat switchCompat = (View) su31Var.b.d;
            switchCompat.setOnCheckedChangeListener(null);
            int iOrdinal2 = kfeVar.ordinal();
            if (iOrdinal2 == 0) {
                zJ2 = u890.j(rh90Var.e.b, Boolean.TRUE);
            } else {
                if (iOrdinal2 != 1) {
                    eg.o();
                    return;
                }
                zJ2 = u890.j(rh90Var.e.a, Boolean.TRUE);
            }
            switchCompat.setChecked(zJ2);
            final byte b2 = 0;
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: p.sge
                public final /* synthetic */ tge b;

                {
                    this.b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    byte b3 = b2;
                    tge tgeVar = this.b;
                    switch (b3) {
                        case 0:
                            tgeVar.onCheckedChanged(compoundButton, z);
                            break;
                        default:
                            tgeVar.onCheckedChanged(compoundButton, z);
                            break;
                    }
                }
            });
            return;
        }
        if (!(rh90Var instanceof mh90)) {
            eg.o();
            return;
        }
        for (rh90 rh90Var2 : ((mh90) rh90Var).f) {
            SwitchCompat switchCompat2 = (View) su31Var.b.d;
            switchCompat2.setOnCheckedChangeListener(null);
            int iOrdinal3 = kfeVar.ordinal();
            if (iOrdinal3 == 0) {
                zJ = u890.j(rh90Var2.e.b, Boolean.TRUE);
            } else {
                if (iOrdinal3 != 1) {
                    eg.o();
                    return;
                }
                zJ = u890.j(rh90Var2.e.a, Boolean.TRUE);
            }
            switchCompat2.setChecked(zJ);
            switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: p.sge
                public final /* synthetic */ tge b;

                {
                    this.b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    byte b3 = b;
                    tge tgeVar = this.b;
                    switch (b3) {
                        case 0:
                            tgeVar.onCheckedChanged(compoundButton, z);
                            break;
                        default:
                            tgeVar.onCheckedChanged(compoundButton, z);
                            break;
                    }
                }
            });
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.c.invoke(this.b, Boolean.valueOf(z));
    }
}
