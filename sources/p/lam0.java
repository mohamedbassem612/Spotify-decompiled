package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class lam0 {
    public final String toString() {
        if (this instanceof dam0) {
            return "ConditionSatisfied";
        }
        if (this instanceof eam0) {
            return "ConditionUnsatisfied";
        }
        if (this instanceof fam0) {
            return "Deinitialize";
        }
        if (this instanceof gam0) {
            return "Deinitialized";
        }
        if (this instanceof iam0) {
            return "SetSubscriber";
        }
        if (this instanceof ham0) {
            return "RemoveSubscriber";
        }
        if (this instanceof cam0) {
            return "ComponentInitialized";
        }
        if (this instanceof kam0) {
            return "ShutdownHooksCompleted";
        }
        if (this instanceof jam0) {
            return "ShutdownCompleted";
        }
        eg.o();
        return null;
    }
}
