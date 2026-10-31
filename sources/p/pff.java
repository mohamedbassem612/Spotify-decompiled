package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pff extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pff(uff uffVar, byte b) {
        super(0);
        this.a = b;
        this.b = uffVar;
    }

    public final Object invoke() {
        byte b = this.a;
        uff uffVar = this.b;
        switch (b) {
            case 0:
                nhq nhqVar = uffVar.X;
                tgf tgfVar = uffVar.e;
                String str = tgfVar.a;
                String str2 = tgfVar.c;
                thq thqVar = nhqVar.a;
                teq teqVar = thqVar.c;
                return new z9x((lzn0) teqVar.i.get(), (zgq) teqVar.a.kg.get(), (oto0) thqVar.b.Em.get(), str, str2);
            default:
                ohq ohqVar = uffVar.Y;
                tgf tgfVar2 = uffVar.e;
                String str3 = tgfVar2.c;
                String str4 = tgfVar2.a;
                teq teqVar2 = ohqVar.a.c;
                return new z3i0(str4, str3, (zgq) teqVar2.a.kg.get(), (phq) teqVar2.a.Dg.get());
        }
    }
}
