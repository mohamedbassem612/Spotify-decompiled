package p;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tdh {
    public final int a;
    public pa61 b;
    public int c;
    public int d;
    public Uri e;
    public CharSequence f;
    public Bundle g;
    public boolean h;
    public u280 i;
    public Object j;

    /* JADX WARN: Illegal instructions before constructor call */
    public tdh(int i) {
        int i2;
        String str = udh.k;
        switch (i) {
            case 57369:
                i2 = 2131233520;
                break;
            case 57370:
                i2 = 2131233521;
                break;
            case 57372:
                i2 = 2131233528;
                break;
            case 57375:
                i2 = 2131233530;
                break;
            case 57376:
                i2 = 2131233564;
                break;
            case 57396:
                i2 = 2131233540;
                break;
            case 57399:
                i2 = 2131233541;
                break;
            case 57403:
                i2 = 2131233550;
                break;
            case 57408:
                i2 = 2131233561;
                break;
            case 57409:
                i2 = 2131233563;
                break;
            case 57410:
                i2 = 2131233571;
                break;
            case 57411:
                i2 = 2131233568;
                break;
            case 57412:
                i2 = 2131233539;
                break;
            case 57413:
                i2 = 2131233555;
                break;
            case 57415:
                i2 = 2131233583;
                break;
            case 57416:
                i2 = 2131233584;
                break;
            case 57421:
                i2 = 2131233591;
                break;
            case 57423:
                i2 = 2131233592;
                break;
            case 57424:
                i2 = 2131233593;
                break;
            case 57430:
                i2 = 2131233577;
                break;
            case 57431:
                i2 = 2131233579;
                break;
            case 57432:
                i2 = 2131233580;
                break;
            case 57433:
                i2 = 2131233572;
                break;
            case 57434:
                i2 = 2131233574;
                break;
            case 57435:
                i2 = 2131233575;
                break;
            case 57436:
                i2 = 2131233557;
                break;
            case 57446:
                i2 = 2131233558;
                break;
            case 57447:
                i2 = 2131233559;
                break;
            case 57448:
                i2 = 2131233542;
                break;
            case 57573:
                i2 = 2131233531;
                break;
            case 57669:
                i2 = 2131233552;
                break;
            case 57671:
                i2 = 2131233554;
                break;
            case 57675:
                i2 = 2131233522;
                break;
            case 57683:
                i2 = 2131233533;
                break;
            case 57691:
                i2 = 2131233536;
                break;
            case 58409:
                i2 = 2131233556;
                break;
            case 58654:
                i2 = 2131233560;
                break;
            case 58919:
                i2 = 2131233586;
                break;
            case 59405:
                i2 = 2131233566;
                break;
            case 59448:
                i2 = 2131233582;
                break;
            case 59494:
                i2 = 2131233524;
                break;
            case 59500:
                i2 = 2131233526;
                break;
            case 59517:
                i2 = 2131233535;
                break;
            case 59576:
                i2 = 2131233565;
                break;
            case 59611:
                i2 = 2131233588;
                break;
            case 59612:
                i2 = 2131233590;
                break;
            case 60288:
                i2 = 2131233551;
                break;
            case 61298:
                i2 = 2131233585;
                break;
            case 61389:
                i2 = 2131233545;
                break;
            case 61512:
                i2 = 2131233570;
                break;
            case 61916:
                i2 = 2131233529;
                break;
            case 62688:
                i2 = 2131233547;
                break;
            case 62689:
                i2 = 2131233546;
                break;
            case 62690:
                i2 = 2131233543;
                break;
            case 62699:
                i2 = 2131233549;
                break;
            case 63220:
                i2 = 2131233576;
                break;
            case 1040448:
                i2 = 2131233562;
                break;
            case 1040451:
                i2 = 2131233569;
                break;
            case 1040452:
                i2 = 2131233567;
                break;
            case 1040470:
                i2 = 2131233578;
                break;
            case 1040473:
                i2 = 2131233573;
                break;
            case 1040711:
                i2 = 2131233553;
                break;
            case 1040712:
                i2 = 2131233537;
                break;
            case 1040713:
                i2 = 2131233538;
                break;
            case 1040723:
                i2 = 2131233532;
                break;
            case 1042488:
                i2 = 2131233581;
                break;
            case 1042534:
                i2 = 2131233523;
                break;
            case 1042540:
                i2 = 2131233525;
                break;
            case 1042557:
                i2 = 2131233534;
                break;
            case 1042651:
                i2 = 2131233587;
                break;
            case 1042652:
                i2 = 2131233589;
                break;
            case 1045728:
                i2 = 2131233548;
                break;
            case 1045730:
                i2 = 2131233544;
                break;
            default:
                i2 = 0;
                break;
        }
        this(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x008f  */
    public final udh a() {
        int i;
        int i2;
        dm5.z((this.b == null) != (this.c == -1), "Exactly one of sessionCommand and playerCommand should be set");
        if (this.i == null) {
            int i3 = this.c;
            String str = udh.k;
            if (i3 == 1 || (i2 = this.a) == 57399 || i2 == 57396) {
                i = 1;
            } else if (i3 == 11 || i3 == 7) {
                i = 2;
            } else {
                i = 6;
                if (i3 == 6 || i2 == 57413 || i2 == 57376 || i2 == 57410 || i2 == 57435 || i2 == 57433 || i2 == 1040473 || i2 == 57434) {
                    i = 2;
                } else if (i3 == 12 || i3 == 9 || i3 == 8 || i2 == 57412 || i2 == 57375 || i2 == 63220 || i2 == 57432 || i2 == 57430 || i2 == 1040470 || i2 == 57431) {
                    i = 3;
                }
            }
            this.i = new u280(1, new int[]{i});
        }
        return new udh(this.b, this.c, this.a, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final void b(pa61 pa61Var) {
        dm5.n(this.c == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
        this.b = pa61Var;
        this.j = null;
    }

    public final void c(pa61 pa61Var, Object obj) {
        dm5.n(this.c == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
        this.b = pa61Var;
        int i = pa61Var.a;
        String str = udh.k;
        this.j = udh.n(i == 40010 ? 5 : 0, obj);
    }

    public final void d(int... iArr) {
        u280 u280Var;
        dm5.m(iArr.length != 0);
        if (iArr.length == 0) {
            u280Var = u280.c;
        } else {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            u280Var = new u280(iArrCopyOf.length, iArrCopyOf);
        }
        this.i = u280Var;
    }

    public tdh(int i, int i2) {
        this.a = i;
        this.d = i2;
        this.f = "";
        this.g = Bundle.EMPTY;
        this.c = -1;
        this.h = true;
    }
}
