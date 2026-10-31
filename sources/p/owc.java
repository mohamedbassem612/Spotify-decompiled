package p;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class owc implements pwc {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ owc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final CharSequence a(nwc nwcVar) {
        fvc fvcVar;
        CarIcon carIconCreateOriginalIcon;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kwc kwcVar = (kwc) nwcVar;
                androidx.car.app.k kVar = (androidx.car.app.k) ((ynb0) obj).get();
                int i = kwcVar.a;
                String[] strArr = (String[]) kwcVar.b.toArray(new String[0]);
                return kVar.getString(i, Arrays.copyOf(strArr, strArr.length));
            default:
                mwc mwcVar = (mwc) nwcVar;
                cx21 cx21Var = (cx21) obj;
                en81 en81Var = en81.e;
                en81 en81Var2 = en81.a;
                String str = mwcVar.b;
                Set<gn81> set = mwcVar.a;
                if (set.isEmpty()) {
                    return str;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (gn81 gn81Var : set) {
                    if (!(gn81Var instanceof fn81)) {
                        if (gn81Var instanceof en81) {
                            en81 en81Var3 = (en81) gn81Var;
                            if (en81Var3.equals(en81.b)) {
                                fvcVar = new fvc((Integer) 2131233219, (String) null, zuc.p.b(), 10);
                            } else if (en81Var3.equals(en81Var2)) {
                                fvcVar = new fvc((Integer) 2131233200, (String) null, zuc.c.b(), 10);
                            } else if (en81Var3.equals(en81.c)) {
                                fvcVar = new fvc((Integer) 2131231791, (String) null, zuc.b.b(), 10);
                            } else if (en81Var3.equals(en81Var)) {
                                fvcVar = new fvc((Integer) 2131233370, (String) null, zuc.c.b(), 10);
                            } else if (en81Var3.equals(en81.d)) {
                                fvcVar = new fvc((Integer) 2131233225, (String) null, zuc.p.b(), 10);
                            } else {
                                eg.o();
                            }
                            if (gn81Var.equals(en81Var) || gn81Var.equals(en81Var2)) {
                                androidx.car.app.k kVar2 = (androidx.car.app.k) cx21Var.a.get();
                                Integer num = fvcVar.a;
                                if (num != null) {
                                    carIconCreateOriginalIcon = CarIcon.createOriginalIcon(IconCompat.f(kVar2, num.intValue()));
                                } else {
                                    hhg1.n("Required value was null.");
                                }
                            } else {
                                carIconCreateOriginalIcon = cx21Var.a(fvcVar);
                            }
                            CarIconSpan carIconSpanCreate = CarIconSpan.create(carIconCreateOriginalIcon, 2);
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) ("{" + gn81Var.getClass().getSimpleName() + "}"));
                            spannableStringBuilder.setSpan(carIconSpanCreate, length, spannableStringBuilder.length(), 17);
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    ForegroundCarColorSpan foregroundCarColorSpanCreate = ForegroundCarColorSpan.create(zuc.b.a());
                    int length2 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) ((fn81) gn81Var).a);
                    spannableStringBuilder.setSpan(foregroundCarColorSpanCreate, length2, spannableStringBuilder.length(), 17);
                    spannableStringBuilder.append((CharSequence) " ");
                }
                spannableStringBuilder.append((CharSequence) str);
                return new SpannedString(spannableStringBuilder);
        }
    }
}
