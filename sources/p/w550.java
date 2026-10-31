package p;

import app.p000rive.RiveFile;
import app.p000rive.ViewModelInstance;
import app.p000rive.core.CommandQueue;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w550 extends a8d1 implements vu30 {
    public final /* synthetic */ Map N0;
    public final /* synthetic */ List O0;
    public final /* synthetic */ x550 P0;
    public final /* synthetic */ iac0 Q0;
    public byte X;
    public final /* synthetic */ Map Y;
    public final /* synthetic */ byte[] Z;
    public CommandQueue a;
    public RiveFile b;
    public Object c;
    public Object d;
    public ViewModelInstance e;
    public String f;
    public x550 g;
    public Iterator h;
    public String i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w550(Map map, byte[] bArr, Map map2, List list, x550 x550Var, iac0 iac0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.Y = map;
        this.Z = bArr;
        this.N0 = map2;
        this.O0 = list;
        this.P0 = x550Var;
        this.Q0 = iac0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new w550(this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:22:0x0112  */
    /* JADX WARN: Code duplicated, block: B:25:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0266  */
    /* JADX WARN: Code duplicated, block: B:66:0x027e  */
    /* JADX WARN: Code duplicated, block: B:72:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[LOOP:0: B:64:0x0278->B:91:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0112 -> B:23:0x0119). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0219 -> B:51:0x021d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w550.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
