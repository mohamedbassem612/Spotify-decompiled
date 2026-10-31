package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class i1w extends bey0 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1w(a2w a2wVar, byte b) {
        super(a2wVar, a2w.class, "nameComponent", "getNameComponent()Lcom/spotify/encoreconsumermobile/component/Component;", 0);
        this.b = b;
        switch (b) {
            case 1:
                super(a2wVar, a2w.class, "socialHandleComponent", "getSocialHandleComponent()Lcom/spotify/encoreconsumermobile/component/Component;", 0);
                break;
            case 2:
                super(a2wVar, a2w.class, "bioComponent", "getBioComponent()Lcom/spotify/encoreconsumermobile/component/Component;", 0);
                break;
            case 3:
                super(a2wVar, a2w.class, "kidNameComponent", "getKidNameComponent()Lcom/spotify/encoreconsumermobile/component/Component;", 0);
                break;
            case 4:
                super(a2wVar, a2w.class, "pronounsComponent", "getPronounsComponent()Lcom/spotify/encoreconsumermobile/component/Component;", 0);
                break;
            case 5:
                super(a2wVar, a2w.class, "locationComponent", "getLocationComponent()Lcom/spotify/encoreconsumermobile/component/Component;", 0);
                break;
            default:
                break;
        }
    }

    public final Object get() {
        switch (this.b) {
            case 0:
                return ((a2w) ((lyc) this).receiver).P0;
            case 1:
                return ((a2w) ((lyc) this).receiver).Q0;
            case 2:
                return ((a2w) ((lyc) this).receiver).R0;
            case 3:
                return ((a2w) ((lyc) this).receiver).S0;
            case 4:
                return ((a2w) ((lyc) this).receiver).T0;
            case 5:
                return ((a2w) ((lyc) this).receiver).U0;
            case 6:
                return ((tob1) ((lyc) this).receiver).getValue();
            case 7:
                return ((tob1) ((lyc) this).receiver).getValue();
            case 8:
                return ((tob1) ((lyc) this).receiver).getValue();
            case 9:
                return ((tob1) ((lyc) this).receiver).getValue();
            case 10:
                return v8r.l(((lyc) this).receiver);
            case 11:
                return ((tob1) ((lyc) this).receiver).getValue();
            case 12:
                return ((d6b1) ((lyc) this).receiver).a();
            case 13:
                return Boolean.valueOf(((rs61) ((lyc) this).receiver).isEnabled());
            case 14:
                ((mu61) ((lyc) this).receiver).getClass();
                return Boolean.TRUE;
            case 15:
                return ((tob1) ((lyc) this).receiver).getValue();
            default:
                return ((tob1) ((lyc) this).receiver).getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1w(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.b = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1w(yoe0 yoe0Var) {
        super(yoe0Var, v8r.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        this.b = (byte) 10;
    }
}
